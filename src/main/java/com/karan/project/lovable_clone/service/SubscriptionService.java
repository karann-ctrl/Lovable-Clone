package com.karan.project.lovable_clone.service;

import com.karan.project.lovable_clone.dto.subscription.CheckoutRequest;
import com.karan.project.lovable_clone.dto.subscription.CheckoutResponse;
import com.karan.project.lovable_clone.dto.subscription.PortalResponse;
import com.karan.project.lovable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
