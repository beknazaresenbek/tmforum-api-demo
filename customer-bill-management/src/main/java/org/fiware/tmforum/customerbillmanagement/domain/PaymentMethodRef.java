package org.fiware.tmforum.customerbillmanagement.domain;

import lombok.EqualsAndHashCode;
import org.fiware.tmforum.common.domain.RefEntity;

import java.util.List;
import java.util.Optional;

@EqualsAndHashCode(callSuper = true)
public class PaymentMethodRef extends RefEntity {

	public PaymentMethodRef(String id) {
		super(id);
	}

	@Override public List<String> getReferencedTypes() {
		return Optional.ofNullable(getAtReferredType()).map(List::of).orElse(List.of());
	}
}
