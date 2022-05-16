// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.billing;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.billing.inputs.GetBillingRoleAssignmentByBillingAccountArgs;
import com.pulumi.azurenative.billing.inputs.GetBillingRoleAssignmentByDepartmentArgs;
import com.pulumi.azurenative.billing.inputs.GetBillingRoleAssignmentByEnrollmentAccountArgs;
import com.pulumi.azurenative.billing.inputs.ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionArgs;
import com.pulumi.azurenative.billing.outputs.GetBillingRoleAssignmentByBillingAccountResult;
import com.pulumi.azurenative.billing.outputs.GetBillingRoleAssignmentByDepartmentResult;
import com.pulumi.azurenative.billing.outputs.GetBillingRoleAssignmentByEnrollmentAccountResult;
import com.pulumi.azurenative.billing.outputs.ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class BillingFunctions {
    /**
     * The role assignment
     * API Version: 2019-10-01-preview.
     * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByBillingAccountResult> getBillingRoleAssignmentByBillingAccount(GetBillingRoleAssignmentByBillingAccountArgs args) {
        return getBillingRoleAssignmentByBillingAccount(args, InvokeOptions.Empty);
    }
    /**
     * The role assignment
     * API Version: 2019-10-01-preview.
     * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByBillingAccountResult> getBillingRoleAssignmentByBillingAccount(GetBillingRoleAssignmentByBillingAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:billing:getBillingRoleAssignmentByBillingAccount", TypeShape.of(GetBillingRoleAssignmentByBillingAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The role assignment
     * API Version: 2019-10-01-preview.
     * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByDepartmentResult> getBillingRoleAssignmentByDepartment(GetBillingRoleAssignmentByDepartmentArgs args) {
        return getBillingRoleAssignmentByDepartment(args, InvokeOptions.Empty);
    }
    /**
     * The role assignment
     * API Version: 2019-10-01-preview.
     * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByDepartmentResult> getBillingRoleAssignmentByDepartment(GetBillingRoleAssignmentByDepartmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:billing:getBillingRoleAssignmentByDepartment", TypeShape.of(GetBillingRoleAssignmentByDepartmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The role assignment
     * API Version: 2019-10-01-preview.
     * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByEnrollmentAccountResult> getBillingRoleAssignmentByEnrollmentAccount(GetBillingRoleAssignmentByEnrollmentAccountArgs args) {
        return getBillingRoleAssignmentByEnrollmentAccount(args, InvokeOptions.Empty);
    }
    /**
     * The role assignment
     * API Version: 2019-10-01-preview.
     * 
     */
    public static CompletableFuture<GetBillingRoleAssignmentByEnrollmentAccountResult> getBillingRoleAssignmentByEnrollmentAccount(GetBillingRoleAssignmentByEnrollmentAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:billing:getBillingRoleAssignmentByEnrollmentAccount", TypeShape.of(GetBillingRoleAssignmentByEnrollmentAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The list of invoice section properties with create subscription permission.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult> listBillingAccountInvoiceSectionsByCreateSubscriptionPermission(ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionArgs args) {
        return listBillingAccountInvoiceSectionsByCreateSubscriptionPermission(args, InvokeOptions.Empty);
    }
    /**
     * The list of invoice section properties with create subscription permission.
     * API Version: 2020-05-01.
     * 
     */
    public static CompletableFuture<ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult> listBillingAccountInvoiceSectionsByCreateSubscriptionPermission(ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:billing:listBillingAccountInvoiceSectionsByCreateSubscriptionPermission", TypeShape.of(ListBillingAccountInvoiceSectionsByCreateSubscriptionPermissionResult.class), args, Utilities.withVersion(options));
    }
}
