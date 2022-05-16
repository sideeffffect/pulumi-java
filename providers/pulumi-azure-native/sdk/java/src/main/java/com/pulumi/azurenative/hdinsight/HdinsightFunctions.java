// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hdinsight.inputs.GetApplicationArgs;
import com.pulumi.azurenative.hdinsight.inputs.GetClusterArgs;
import com.pulumi.azurenative.hdinsight.inputs.GetClusterGatewaySettingsArgs;
import com.pulumi.azurenative.hdinsight.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.hdinsight.outputs.GetApplicationResult;
import com.pulumi.azurenative.hdinsight.outputs.GetClusterGatewaySettingsResult;
import com.pulumi.azurenative.hdinsight.outputs.GetClusterResult;
import com.pulumi.azurenative.hdinsight.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class HdinsightFunctions {
    /**
     * The HDInsight cluster application
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args) {
        return getApplication(args, InvokeOptions.Empty);
    }
    /**
     * The HDInsight cluster application
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetApplicationResult> getApplication(GetApplicationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hdinsight:getApplication", TypeShape.of(GetApplicationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The HDInsight cluster.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args) {
        return getCluster(args, InvokeOptions.Empty);
    }
    /**
     * The HDInsight cluster.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterResult> getCluster(GetClusterArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hdinsight:getCluster", TypeShape.of(GetClusterResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gateway settings.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterGatewaySettingsResult> getClusterGatewaySettings(GetClusterGatewaySettingsArgs args) {
        return getClusterGatewaySettings(args, InvokeOptions.Empty);
    }
    /**
     * Gateway settings.
     * API Version: 2018-06-01-preview.
     * 
     */
    public static CompletableFuture<GetClusterGatewaySettingsResult> getClusterGatewaySettings(GetClusterGatewaySettingsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hdinsight:getClusterGatewaySettings", TypeShape.of(GetClusterGatewaySettingsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The private endpoint connection.
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * The private endpoint connection.
     * API Version: 2021-06-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:hdinsight:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
}
