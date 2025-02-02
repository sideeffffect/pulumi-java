// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigee_v1.DebugSessionArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a debug session for a deployed API Proxy revision.
 * Note - this resource&#39;s API doesn&#39;t support deletion. When deleted, the resource will persist
 * on Google Cloud even though it will be deleted from Pulumi state.
 * 
 */
@ResourceType(type="google-native:apigee/v1:DebugSession")
public class DebugSession extends com.pulumi.resources.CustomResource {
    /**
     * Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    @Export(name="count", type=Integer.class, parameters={})
    private Output<Integer> count;

    /**
     * @return Optional. The number of request to be traced. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }
    /**
     * The first transaction creation timestamp, recorded by UAP.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The first transaction creation timestamp, recorded by UAP.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return Optional. A conditional statement which is evaluated against the request message to determine if it should be traced. Syntax matches that of on API Proxy bundle flow Condition.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }
    /**
     * A unique ID for this DebugSession.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A unique ID for this DebugSession.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    @Export(name="timeout", type=String.class, parameters={})
    private Output<String> timeout;

    /**
     * @return Optional. The time in seconds after which this DebugSession should end. This value will override the value in query param, if both are provided.
     * 
     */
    public Output<String> timeout() {
        return this.timeout;
    }
    /**
     * Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    @Export(name="tracesize", type=Integer.class, parameters={})
    private Output<Integer> tracesize;

    /**
     * @return Optional. The maximum number of bytes captured from the response payload. Min = 0, Max = 5120, Default = 5120.
     * 
     */
    public Output<Integer> tracesize() {
        return this.tracesize;
    }
    /**
     * Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    @Export(name="validity", type=Integer.class, parameters={})
    private Output<Integer> validity;

    /**
     * @return Optional. The length of time, in seconds, that this debug session is valid, starting from when it&#39;s received in the control plane. Min = 1, Max = 15, Default = 10.
     * 
     */
    public Output<Integer> validity() {
        return this.validity;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DebugSession(String name) {
        this(name, DebugSessionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DebugSession(String name, DebugSessionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DebugSession(String name, DebugSessionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:DebugSession", name, args == null ? DebugSessionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DebugSession(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigee/v1:DebugSession", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DebugSession get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DebugSession(name, id, options);
    }
}
