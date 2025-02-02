// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.labservices.inputs.GetEnvironmentArgs;
import com.pulumi.azurenative.labservices.inputs.GetEnvironmentPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetEnvironmentSettingArgs;
import com.pulumi.azurenative.labservices.inputs.GetEnvironmentSettingPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetGalleryImageArgs;
import com.pulumi.azurenative.labservices.inputs.GetGalleryImagePlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserEnvironmentArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserEnvironmentPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationBatchStatusArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationBatchStatusPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationStatusArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserOperationStatusPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserPersonalPreferencesArgs;
import com.pulumi.azurenative.labservices.inputs.GetGlobalUserPersonalPreferencesPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabAccountArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabAccountPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabAccountRegionalAvailabilityArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabAccountRegionalAvailabilityPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabPlanArgs;
import com.pulumi.azurenative.labservices.inputs.GetLabPlanPlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetScheduleArgs;
import com.pulumi.azurenative.labservices.inputs.GetSchedulePlainArgs;
import com.pulumi.azurenative.labservices.inputs.GetUserArgs;
import com.pulumi.azurenative.labservices.inputs.GetUserPlainArgs;
import com.pulumi.azurenative.labservices.inputs.ListGlobalUserEnvironmentsArgs;
import com.pulumi.azurenative.labservices.inputs.ListGlobalUserEnvironmentsPlainArgs;
import com.pulumi.azurenative.labservices.inputs.ListGlobalUserLabsArgs;
import com.pulumi.azurenative.labservices.inputs.ListGlobalUserLabsPlainArgs;
import com.pulumi.azurenative.labservices.outputs.GetEnvironmentResult;
import com.pulumi.azurenative.labservices.outputs.GetEnvironmentSettingResult;
import com.pulumi.azurenative.labservices.outputs.GetGalleryImageResult;
import com.pulumi.azurenative.labservices.outputs.GetGlobalUserEnvironmentResult;
import com.pulumi.azurenative.labservices.outputs.GetGlobalUserOperationBatchStatusResult;
import com.pulumi.azurenative.labservices.outputs.GetGlobalUserOperationStatusResult;
import com.pulumi.azurenative.labservices.outputs.GetGlobalUserPersonalPreferencesResult;
import com.pulumi.azurenative.labservices.outputs.GetLabAccountRegionalAvailabilityResult;
import com.pulumi.azurenative.labservices.outputs.GetLabAccountResult;
import com.pulumi.azurenative.labservices.outputs.GetLabPlanResult;
import com.pulumi.azurenative.labservices.outputs.GetLabResult;
import com.pulumi.azurenative.labservices.outputs.GetScheduleResult;
import com.pulumi.azurenative.labservices.outputs.GetUserResult;
import com.pulumi.azurenative.labservices.outputs.ListGlobalUserEnvironmentsResult;
import com.pulumi.azurenative.labservices.outputs.ListGlobalUserLabsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class LabservicesFunctions {
    /**
     * Represents an environment instance
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args) {
        return getEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Represents an environment instance
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args) {
        return getEnvironmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents an environment instance
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetEnvironmentResult> getEnvironment(GetEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an environment instance
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetEnvironmentResult> getEnvironmentPlain(GetEnvironmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getEnvironment", TypeShape.of(GetEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents settings of an environment, from which environment instances would be created
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetEnvironmentSettingResult> getEnvironmentSetting(GetEnvironmentSettingArgs args) {
        return getEnvironmentSetting(args, InvokeOptions.Empty);
    }
    /**
     * Represents settings of an environment, from which environment instances would be created
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetEnvironmentSettingResult> getEnvironmentSettingPlain(GetEnvironmentSettingPlainArgs args) {
        return getEnvironmentSettingPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents settings of an environment, from which environment instances would be created
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetEnvironmentSettingResult> getEnvironmentSetting(GetEnvironmentSettingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getEnvironmentSetting", TypeShape.of(GetEnvironmentSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents settings of an environment, from which environment instances would be created
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetEnvironmentSettingResult> getEnvironmentSettingPlain(GetEnvironmentSettingPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getEnvironmentSetting", TypeShape.of(GetEnvironmentSettingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an image from the Azure Marketplace
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGalleryImageResult> getGalleryImage(GetGalleryImageArgs args) {
        return getGalleryImage(args, InvokeOptions.Empty);
    }
    /**
     * Represents an image from the Azure Marketplace
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGalleryImageResult> getGalleryImagePlain(GetGalleryImagePlainArgs args) {
        return getGalleryImagePlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents an image from the Azure Marketplace
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGalleryImageResult> getGalleryImage(GetGalleryImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getGalleryImage", TypeShape.of(GetGalleryImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents an image from the Azure Marketplace
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGalleryImageResult> getGalleryImagePlain(GetGalleryImagePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGalleryImage", TypeShape.of(GetGalleryImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the environments details
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserEnvironmentResult> getGlobalUserEnvironment(GetGlobalUserEnvironmentArgs args) {
        return getGlobalUserEnvironment(args, InvokeOptions.Empty);
    }
    /**
     * Represents the environments details
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserEnvironmentResult> getGlobalUserEnvironmentPlain(GetGlobalUserEnvironmentPlainArgs args) {
        return getGlobalUserEnvironmentPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents the environments details
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserEnvironmentResult> getGlobalUserEnvironment(GetGlobalUserEnvironmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getGlobalUserEnvironment", TypeShape.of(GetGlobalUserEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the environments details
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserEnvironmentResult> getGlobalUserEnvironmentPlain(GetGlobalUserEnvironmentPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserEnvironment", TypeShape.of(GetGlobalUserEnvironmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserOperationBatchStatusResult> getGlobalUserOperationBatchStatus(GetGlobalUserOperationBatchStatusArgs args) {
        return getGlobalUserOperationBatchStatus(args, InvokeOptions.Empty);
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserOperationBatchStatusResult> getGlobalUserOperationBatchStatusPlain(GetGlobalUserOperationBatchStatusPlainArgs args) {
        return getGlobalUserOperationBatchStatusPlain(args, InvokeOptions.Empty);
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserOperationBatchStatusResult> getGlobalUserOperationBatchStatus(GetGlobalUserOperationBatchStatusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getGlobalUserOperationBatchStatus", TypeShape.of(GetGlobalUserOperationBatchStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserOperationBatchStatusResult> getGlobalUserOperationBatchStatusPlain(GetGlobalUserOperationBatchStatusPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserOperationBatchStatus", TypeShape.of(GetGlobalUserOperationBatchStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserOperationStatusResult> getGlobalUserOperationStatus(GetGlobalUserOperationStatusArgs args) {
        return getGlobalUserOperationStatus(args, InvokeOptions.Empty);
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserOperationStatusResult> getGlobalUserOperationStatusPlain(GetGlobalUserOperationStatusPlainArgs args) {
        return getGlobalUserOperationStatusPlain(args, InvokeOptions.Empty);
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserOperationStatusResult> getGlobalUserOperationStatus(GetGlobalUserOperationStatusArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getGlobalUserOperationStatus", TypeShape.of(GetGlobalUserOperationStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Status Details of the long running operation for an environment
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserOperationStatusResult> getGlobalUserOperationStatusPlain(GetGlobalUserOperationStatusPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserOperationStatus", TypeShape.of(GetGlobalUserOperationStatusResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the PersonalPreferences for the user
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserPersonalPreferencesResult> getGlobalUserPersonalPreferences(GetGlobalUserPersonalPreferencesArgs args) {
        return getGlobalUserPersonalPreferences(args, InvokeOptions.Empty);
    }
    /**
     * Represents the PersonalPreferences for the user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserPersonalPreferencesResult> getGlobalUserPersonalPreferencesPlain(GetGlobalUserPersonalPreferencesPlainArgs args) {
        return getGlobalUserPersonalPreferencesPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents the PersonalPreferences for the user
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetGlobalUserPersonalPreferencesResult> getGlobalUserPersonalPreferences(GetGlobalUserPersonalPreferencesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getGlobalUserPersonalPreferences", TypeShape.of(GetGlobalUserPersonalPreferencesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the PersonalPreferences for the user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetGlobalUserPersonalPreferencesResult> getGlobalUserPersonalPreferencesPlain(GetGlobalUserPersonalPreferencesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getGlobalUserPersonalPreferences", TypeShape.of(GetGlobalUserPersonalPreferencesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a lab.
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetLabResult> getLab(GetLabArgs args) {
        return getLab(args, InvokeOptions.Empty);
    }
    /**
     * Represents a lab.
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabResult> getLabPlain(GetLabPlainArgs args) {
        return getLabPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a lab.
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetLabResult> getLab(GetLabArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getLab", TypeShape.of(GetLabResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a lab.
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabResult> getLabPlain(GetLabPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLab", TypeShape.of(GetLabResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a lab account.
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetLabAccountResult> getLabAccount(GetLabAccountArgs args) {
        return getLabAccount(args, InvokeOptions.Empty);
    }
    /**
     * Represents a lab account.
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabAccountResult> getLabAccountPlain(GetLabAccountPlainArgs args) {
        return getLabAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents a lab account.
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetLabAccountResult> getLabAccount(GetLabAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getLabAccount", TypeShape.of(GetLabAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents a lab account.
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabAccountResult> getLabAccountPlain(GetLabAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLabAccount", TypeShape.of(GetLabAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response model from the GetRegionalAvailability action
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetLabAccountRegionalAvailabilityResult> getLabAccountRegionalAvailability(GetLabAccountRegionalAvailabilityArgs args) {
        return getLabAccountRegionalAvailability(args, InvokeOptions.Empty);
    }
    /**
     * The response model from the GetRegionalAvailability action
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabAccountRegionalAvailabilityResult> getLabAccountRegionalAvailabilityPlain(GetLabAccountRegionalAvailabilityPlainArgs args) {
        return getLabAccountRegionalAvailabilityPlain(args, InvokeOptions.Empty);
    }
    /**
     * The response model from the GetRegionalAvailability action
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetLabAccountRegionalAvailabilityResult> getLabAccountRegionalAvailability(GetLabAccountRegionalAvailabilityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getLabAccountRegionalAvailability", TypeShape.of(GetLabAccountRegionalAvailabilityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The response model from the GetRegionalAvailability action
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetLabAccountRegionalAvailabilityResult> getLabAccountRegionalAvailabilityPlain(GetLabAccountRegionalAvailabilityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLabAccountRegionalAvailability", TypeShape.of(GetLabAccountRegionalAvailabilityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lab Plans act as a permission container for creating labs via labs.azure.com. Additionally, they can provide a set of default configurations that will apply at the time of creating a lab, but these defaults can still be overwritten.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static Output<GetLabPlanResult> getLabPlan(GetLabPlanArgs args) {
        return getLabPlan(args, InvokeOptions.Empty);
    }
    /**
     * Lab Plans act as a permission container for creating labs via labs.azure.com. Additionally, they can provide a set of default configurations that will apply at the time of creating a lab, but these defaults can still be overwritten.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static CompletableFuture<GetLabPlanResult> getLabPlanPlain(GetLabPlanPlainArgs args) {
        return getLabPlanPlain(args, InvokeOptions.Empty);
    }
    /**
     * Lab Plans act as a permission container for creating labs via labs.azure.com. Additionally, they can provide a set of default configurations that will apply at the time of creating a lab, but these defaults can still be overwritten.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static Output<GetLabPlanResult> getLabPlan(GetLabPlanArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getLabPlan", TypeShape.of(GetLabPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lab Plans act as a permission container for creating labs via labs.azure.com. Additionally, they can provide a set of default configurations that will apply at the time of creating a lab, but these defaults can still be overwritten.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static CompletableFuture<GetLabPlanResult> getLabPlanPlain(GetLabPlanPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getLabPlan", TypeShape.of(GetLabPlanResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Schedule for automatically turning virtual machines in a lab on and off at specified times.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static Output<GetScheduleResult> getSchedule(GetScheduleArgs args) {
        return getSchedule(args, InvokeOptions.Empty);
    }
    /**
     * Schedule for automatically turning virtual machines in a lab on and off at specified times.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static CompletableFuture<GetScheduleResult> getSchedulePlain(GetSchedulePlainArgs args) {
        return getSchedulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Schedule for automatically turning virtual machines in a lab on and off at specified times.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static Output<GetScheduleResult> getSchedule(GetScheduleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getSchedule", TypeShape.of(GetScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Schedule for automatically turning virtual machines in a lab on and off at specified times.
     * API Version: 2021-10-01-preview.
     * 
     */
    public static CompletableFuture<GetScheduleResult> getSchedulePlain(GetSchedulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getSchedule", TypeShape.of(GetScheduleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The User registered to a lab
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetUserResult> getUser(GetUserArgs args) {
        return getUser(args, InvokeOptions.Empty);
    }
    /**
     * The User registered to a lab
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetUserResult> getUserPlain(GetUserPlainArgs args) {
        return getUserPlain(args, InvokeOptions.Empty);
    }
    /**
     * The User registered to a lab
     * API Version: 2018-10-15.
     * 
     */
    public static Output<GetUserResult> getUser(GetUserArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The User registered to a lab
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<GetUserResult> getUserPlain(GetUserPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:getUser", TypeShape.of(GetUserResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the list of environments owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static Output<ListGlobalUserEnvironmentsResult> listGlobalUserEnvironments(ListGlobalUserEnvironmentsArgs args) {
        return listGlobalUserEnvironments(args, InvokeOptions.Empty);
    }
    /**
     * Represents the list of environments owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<ListGlobalUserEnvironmentsResult> listGlobalUserEnvironmentsPlain(ListGlobalUserEnvironmentsPlainArgs args) {
        return listGlobalUserEnvironmentsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Represents the list of environments owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static Output<ListGlobalUserEnvironmentsResult> listGlobalUserEnvironments(ListGlobalUserEnvironmentsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:listGlobalUserEnvironments", TypeShape.of(ListGlobalUserEnvironmentsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Represents the list of environments owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<ListGlobalUserEnvironmentsResult> listGlobalUserEnvironmentsPlain(ListGlobalUserEnvironmentsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:listGlobalUserEnvironments", TypeShape.of(ListGlobalUserEnvironmentsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lists the labs owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static Output<ListGlobalUserLabsResult> listGlobalUserLabs(ListGlobalUserLabsArgs args) {
        return listGlobalUserLabs(args, InvokeOptions.Empty);
    }
    /**
     * Lists the labs owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<ListGlobalUserLabsResult> listGlobalUserLabsPlain(ListGlobalUserLabsPlainArgs args) {
        return listGlobalUserLabsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Lists the labs owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static Output<ListGlobalUserLabsResult> listGlobalUserLabs(ListGlobalUserLabsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:labservices:listGlobalUserLabs", TypeShape.of(ListGlobalUserLabsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Lists the labs owned by a user
     * API Version: 2018-10-15.
     * 
     */
    public static CompletableFuture<ListGlobalUserLabsResult> listGlobalUserLabsPlain(ListGlobalUserLabsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:labservices:listGlobalUserLabs", TypeShape.of(ListGlobalUserLabsResult.class), args, Utilities.withVersion(options));
    }
}
