// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.digitaltwins;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.digitaltwins.inputs.GetDigitalTwinArgs;
import com.pulumi.azurenative.digitaltwins.inputs.GetDigitalTwinsEndpointArgs;
import com.pulumi.azurenative.digitaltwins.inputs.GetPrivateEndpointConnectionArgs;
import com.pulumi.azurenative.digitaltwins.inputs.GetTimeSeriesDatabaseConnectionArgs;
import com.pulumi.azurenative.digitaltwins.outputs.GetDigitalTwinResult;
import com.pulumi.azurenative.digitaltwins.outputs.GetDigitalTwinsEndpointResult;
import com.pulumi.azurenative.digitaltwins.outputs.GetPrivateEndpointConnectionResult;
import com.pulumi.azurenative.digitaltwins.outputs.GetTimeSeriesDatabaseConnectionResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DigitaltwinsFunctions {
    /**
     * The description of the DigitalTwins service.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDigitalTwinResult> getDigitalTwin(GetDigitalTwinArgs args) {
        return getDigitalTwin(args, InvokeOptions.Empty);
    }
    /**
     * The description of the DigitalTwins service.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDigitalTwinResult> getDigitalTwin(GetDigitalTwinArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:digitaltwins:getDigitalTwin", TypeShape.of(GetDigitalTwinResult.class), args, Utilities.withVersion(options));
    }
    /**
     * DigitalTwinsInstance endpoint resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDigitalTwinsEndpointResult> getDigitalTwinsEndpoint(GetDigitalTwinsEndpointArgs args) {
        return getDigitalTwinsEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * DigitalTwinsInstance endpoint resource.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetDigitalTwinsEndpointResult> getDigitalTwinsEndpoint(GetDigitalTwinsEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:digitaltwins:getDigitalTwinsEndpoint", TypeShape.of(GetDigitalTwinsEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The private endpoint connection of a Digital Twin.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args) {
        return getPrivateEndpointConnection(args, InvokeOptions.Empty);
    }
    /**
     * The private endpoint connection of a Digital Twin.
     * API Version: 2020-12-01.
     * 
     */
    public static CompletableFuture<GetPrivateEndpointConnectionResult> getPrivateEndpointConnection(GetPrivateEndpointConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:digitaltwins:getPrivateEndpointConnection", TypeShape.of(GetPrivateEndpointConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Describes a time series database connection resource.
     * API Version: 2021-06-30-preview.
     * 
     */
    public static CompletableFuture<GetTimeSeriesDatabaseConnectionResult> getTimeSeriesDatabaseConnection(GetTimeSeriesDatabaseConnectionArgs args) {
        return getTimeSeriesDatabaseConnection(args, InvokeOptions.Empty);
    }
    /**
     * Describes a time series database connection resource.
     * API Version: 2021-06-30-preview.
     * 
     */
    public static CompletableFuture<GetTimeSeriesDatabaseConnectionResult> getTimeSeriesDatabaseConnection(GetTimeSeriesDatabaseConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:digitaltwins:getTimeSeriesDatabaseConnection", TypeShape.of(GetTimeSeriesDatabaseConnectionResult.class), args, Utilities.withVersion(options));
    }
}
