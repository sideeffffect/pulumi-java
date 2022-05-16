// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.managednetwork;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.managednetwork.inputs.GetManagedNetworkArgs;
import com.pulumi.azurenative.managednetwork.inputs.GetManagedNetworkGroupArgs;
import com.pulumi.azurenative.managednetwork.inputs.GetManagedNetworkPeeringPolicyArgs;
import com.pulumi.azurenative.managednetwork.inputs.GetScopeAssignmentArgs;
import com.pulumi.azurenative.managednetwork.outputs.GetManagedNetworkGroupResult;
import com.pulumi.azurenative.managednetwork.outputs.GetManagedNetworkPeeringPolicyResult;
import com.pulumi.azurenative.managednetwork.outputs.GetManagedNetworkResult;
import com.pulumi.azurenative.managednetwork.outputs.GetScopeAssignmentResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ManagednetworkFunctions {
    /**
     * The Managed Network resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedNetworkResult> getManagedNetwork(GetManagedNetworkArgs args) {
        return getManagedNetwork(args, InvokeOptions.Empty);
    }
    /**
     * The Managed Network resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedNetworkResult> getManagedNetwork(GetManagedNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managednetwork:getManagedNetwork", TypeShape.of(GetManagedNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Managed Network Group resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedNetworkGroupResult> getManagedNetworkGroup(GetManagedNetworkGroupArgs args) {
        return getManagedNetworkGroup(args, InvokeOptions.Empty);
    }
    /**
     * The Managed Network Group resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedNetworkGroupResult> getManagedNetworkGroup(GetManagedNetworkGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managednetwork:getManagedNetworkGroup", TypeShape.of(GetManagedNetworkGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Managed Network Peering Policy resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedNetworkPeeringPolicyResult> getManagedNetworkPeeringPolicy(GetManagedNetworkPeeringPolicyArgs args) {
        return getManagedNetworkPeeringPolicy(args, InvokeOptions.Empty);
    }
    /**
     * The Managed Network Peering Policy resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetManagedNetworkPeeringPolicyResult> getManagedNetworkPeeringPolicy(GetManagedNetworkPeeringPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managednetwork:getManagedNetworkPeeringPolicy", TypeShape.of(GetManagedNetworkPeeringPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Managed Network resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetScopeAssignmentResult> getScopeAssignment(GetScopeAssignmentArgs args) {
        return getScopeAssignment(args, InvokeOptions.Empty);
    }
    /**
     * The Managed Network resource
     * API Version: 2019-06-01-preview.
     * 
     */
    public static CompletableFuture<GetScopeAssignmentResult> getScopeAssignment(GetScopeAssignmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:managednetwork:getScopeAssignment", TypeShape.of(GetScopeAssignmentResult.class), args, Utilities.withVersion(options));
    }
}
