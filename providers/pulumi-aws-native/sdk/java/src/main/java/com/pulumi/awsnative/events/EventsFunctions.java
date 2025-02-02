// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.events.inputs.GetApiDestinationArgs;
import com.pulumi.awsnative.events.inputs.GetApiDestinationPlainArgs;
import com.pulumi.awsnative.events.inputs.GetArchiveArgs;
import com.pulumi.awsnative.events.inputs.GetArchivePlainArgs;
import com.pulumi.awsnative.events.inputs.GetConnectionArgs;
import com.pulumi.awsnative.events.inputs.GetConnectionPlainArgs;
import com.pulumi.awsnative.events.inputs.GetEndpointArgs;
import com.pulumi.awsnative.events.inputs.GetEndpointPlainArgs;
import com.pulumi.awsnative.events.outputs.GetApiDestinationResult;
import com.pulumi.awsnative.events.outputs.GetArchiveResult;
import com.pulumi.awsnative.events.outputs.GetConnectionResult;
import com.pulumi.awsnative.events.outputs.GetEndpointResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class EventsFunctions {
    /**
     * Resource Type definition for AWS::Events::ApiDestination.
     * 
     */
    public static Output<GetApiDestinationResult> getApiDestination(GetApiDestinationArgs args) {
        return getApiDestination(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::ApiDestination.
     * 
     */
    public static CompletableFuture<GetApiDestinationResult> getApiDestinationPlain(GetApiDestinationPlainArgs args) {
        return getApiDestinationPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::ApiDestination.
     * 
     */
    public static Output<GetApiDestinationResult> getApiDestination(GetApiDestinationArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:events:getApiDestination", TypeShape.of(GetApiDestinationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Events::ApiDestination.
     * 
     */
    public static CompletableFuture<GetApiDestinationResult> getApiDestinationPlain(GetApiDestinationPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:events:getApiDestination", TypeShape.of(GetApiDestinationResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Events::Archive
     * 
     */
    public static Output<GetArchiveResult> getArchive(GetArchiveArgs args) {
        return getArchive(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::Archive
     * 
     */
    public static CompletableFuture<GetArchiveResult> getArchivePlain(GetArchivePlainArgs args) {
        return getArchivePlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::Archive
     * 
     */
    public static Output<GetArchiveResult> getArchive(GetArchiveArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:events:getArchive", TypeShape.of(GetArchiveResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Events::Archive
     * 
     */
    public static CompletableFuture<GetArchiveResult> getArchivePlain(GetArchivePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:events:getArchive", TypeShape.of(GetArchiveResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Events::Connection.
     * 
     */
    public static Output<GetConnectionResult> getConnection(GetConnectionArgs args) {
        return getConnection(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::Connection.
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnectionPlain(GetConnectionPlainArgs args) {
        return getConnectionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::Connection.
     * 
     */
    public static Output<GetConnectionResult> getConnection(GetConnectionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:events:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Events::Connection.
     * 
     */
    public static CompletableFuture<GetConnectionResult> getConnectionPlain(GetConnectionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:events:getConnection", TypeShape.of(GetConnectionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Events::Endpoint.
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args) {
        return getEndpoint(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::Endpoint.
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args) {
        return getEndpointPlain(args, InvokeOptions.Empty);
    }
    /**
     * Resource Type definition for AWS::Events::Endpoint.
     * 
     */
    public static Output<GetEndpointResult> getEndpoint(GetEndpointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("aws-native:events:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Resource Type definition for AWS::Events::Endpoint.
     * 
     */
    public static CompletableFuture<GetEndpointResult> getEndpointPlain(GetEndpointPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws-native:events:getEndpoint", TypeShape.of(GetEndpointResult.class), args, Utilities.withVersion(options));
    }
}
