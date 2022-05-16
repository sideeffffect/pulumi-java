// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.migrate.inputs.GetAssessmentArgs;
import com.pulumi.azurenative.migrate.inputs.GetGroupArgs;
import com.pulumi.azurenative.migrate.inputs.GetHyperVCollectorArgs;
import com.pulumi.azurenative.migrate.inputs.GetImportCollectorArgs;
import com.pulumi.azurenative.migrate.inputs.GetMigrateProjectArgs;
import com.pulumi.azurenative.migrate.inputs.GetMoveCollectionArgs;
import com.pulumi.azurenative.migrate.inputs.GetMoveResourceArgs;
import com.pulumi.azurenative.migrate.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.migrate.inputs.GetProjectArgs;
import com.pulumi.azurenative.migrate.inputs.GetProjectKeysArgs;
import com.pulumi.azurenative.migrate.inputs.GetServerCollectorArgs;
import com.pulumi.azurenative.migrate.inputs.GetSolutionArgs;
import com.pulumi.azurenative.migrate.inputs.GetSolutionConfigArgs;
import com.pulumi.azurenative.migrate.inputs.GetVMwareCollectorArgs;
import com.pulumi.azurenative.migrate.outputs.GetAssessmentResult;
import com.pulumi.azurenative.migrate.outputs.GetGroupResult;
import com.pulumi.azurenative.migrate.outputs.GetHyperVCollectorResult;
import com.pulumi.azurenative.migrate.outputs.GetImportCollectorResult;
import com.pulumi.azurenative.migrate.outputs.GetMigrateProjectResult;
import com.pulumi.azurenative.migrate.outputs.GetMoveCollectionResult;
import com.pulumi.azurenative.migrate.outputs.GetMoveResourceResult;
import com.pulumi.azurenative.migrate.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.migrate.outputs.GetProjectKeysResult;
import com.pulumi.azurenative.migrate.outputs.GetProjectResult;
import com.pulumi.azurenative.migrate.outputs.GetServerCollectorResult;
import com.pulumi.azurenative.migrate.outputs.GetSolutionConfigResult;
import com.pulumi.azurenative.migrate.outputs.GetSolutionResult;
import com.pulumi.azurenative.migrate.outputs.GetVMwareCollectorResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MigrateFunctions {
    /**
     * An assessment created for a group in the Migration project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetAssessmentResult> getAssessment(GetAssessmentArgs args) {
        return getAssessment(args, InvokeOptions.Empty);
    }
    /**
     * An assessment created for a group in the Migration project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetAssessmentResult> getAssessment(GetAssessmentArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getAssessment", TypeShape.of(GetAssessmentResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A group created in a Migration project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args) {
        return getGroup(args, InvokeOptions.Empty);
    }
    /**
     * A group created in a Migration project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetGroupResult> getGroup(GetGroupArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getGroup", TypeShape.of(GetGroupResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetHyperVCollectorResult> getHyperVCollector(GetHyperVCollectorArgs args) {
        return getHyperVCollector(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetHyperVCollectorResult> getHyperVCollector(GetHyperVCollectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getHyperVCollector", TypeShape.of(GetHyperVCollectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetImportCollectorResult> getImportCollector(GetImportCollectorArgs args) {
        return getImportCollector(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetImportCollectorResult> getImportCollector(GetImportCollectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getImportCollector", TypeShape.of(GetImportCollectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Migrate Project REST Resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetMigrateProjectResult> getMigrateProject(GetMigrateProjectArgs args) {
        return getMigrateProject(args, InvokeOptions.Empty);
    }
    /**
     * Migrate Project REST Resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetMigrateProjectResult> getMigrateProject(GetMigrateProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getMigrateProject", TypeShape.of(GetMigrateProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Define the move collection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetMoveCollectionResult> getMoveCollection(GetMoveCollectionArgs args) {
        return getMoveCollection(args, InvokeOptions.Empty);
    }
    /**
     * Define the move collection.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetMoveCollectionResult> getMoveCollection(GetMoveCollectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getMoveCollection", TypeShape.of(GetMoveCollectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Defines the move resource.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetMoveResourceResult> getMoveResource(GetMoveResourceArgs args) {
        return getMoveResource(args, InvokeOptions.Empty);
    }
    /**
     * Defines the move resource.
     * API Version: 2021-01-01.
     * 
     */
    public static CompletableFuture<GetMoveResourceResult> getMoveResource(GetMoveResourceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getMoveResource", TypeShape.of(GetMoveResourceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A private endpoint connection for a project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * A private endpoint connection for a project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Azure Migrate Project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    /**
     * Azure Migrate Project.
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * ID and Key for Migration Project.
     * API Version: 2018-02-02.
     * 
     */
    public static CompletableFuture<GetProjectKeysResult> getProjectKeys(GetProjectKeysArgs args) {
        return getProjectKeys(args, InvokeOptions.Empty);
    }
    /**
     * ID and Key for Migration Project.
     * API Version: 2018-02-02.
     * 
     */
    public static CompletableFuture<GetProjectKeysResult> getProjectKeys(GetProjectKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getProjectKeys", TypeShape.of(GetProjectKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetServerCollectorResult> getServerCollector(GetServerCollectorArgs args) {
        return getServerCollector(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetServerCollectorResult> getServerCollector(GetServerCollectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getServerCollector", TypeShape.of(GetServerCollectorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Solution REST Resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSolutionResult> getSolution(GetSolutionArgs args) {
        return getSolution(args, InvokeOptions.Empty);
    }
    /**
     * Solution REST Resource.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSolutionResult> getSolution(GetSolutionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getSolution", TypeShape.of(GetSolutionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Class representing the config for the solution in the migrate project.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSolutionConfigResult> getSolutionConfig(GetSolutionConfigArgs args) {
        return getSolutionConfig(args, InvokeOptions.Empty);
    }
    /**
     * Class representing the config for the solution in the migrate project.
     * API Version: 2018-09-01-preview.
     * 
     */
    public static CompletableFuture<GetSolutionConfigResult> getSolutionConfig(GetSolutionConfigArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getSolutionConfig", TypeShape.of(GetSolutionConfigResult.class), args, Utilities.withVersion(options));
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetVMwareCollectorResult> getVMwareCollector(GetVMwareCollectorArgs args) {
        return getVMwareCollector(args, InvokeOptions.Empty);
    }
    /**
     * API Version: 2019-10-01.
     * 
     */
    public static CompletableFuture<GetVMwareCollectorResult> getVMwareCollector(GetVMwareCollectorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:migrate:getVMwareCollector", TypeShape.of(GetVMwareCollectorResult.class), args, Utilities.withVersion(options));
    }
}
