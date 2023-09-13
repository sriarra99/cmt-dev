package com.panera.cmt.dto.proxy.subscription_service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SubscriptionServiceCoffeeUsageResults {
    private List<CoffeeSubscriptionUsage> results;
}
