// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.core_v1.inputs.ServiceSpecArgs;
import com.pulumi.kubernetes.core_v1.inputs.ServiceStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Service is a named abstraction of software service (for example, mysql) consisting of local port (for example 3306) that the proxy listens on, and the selector that determines which pods will answer requests sent through the proxy.
 * 
 * This resource waits until its status is ready before registering success
 * for create/update, and populating output properties from the current state of the resource.
 * The following conditions are used to determine whether the resource creation has
 * succeeded or failed:
 * 
 * 1. Service object exists.
 * 2. Related Endpoint objects are created. Each time we get an update, wait 10 seconds
 *    for any stragglers.
 * 3. The endpoints objects target some number of living objects (unless the Service is
 *    an &#34;empty headless&#34; Service [1] or a Service with &#39;.spec.type: ExternalName&#39;).
 * 4. External IP address is allocated (if Service has &#39;.spec.type: LoadBalancer&#39;).
 * 
 * Known limitations:
 * Services targeting ReplicaSets (and, by extension, Deployments,
 * StatefulSets, etc.) with &#39;.spec.replicas&#39; set to 0 are not handled, and will time
 * out. To work around this limitation, set &#39;pulumi.com/skipAwait: &#34;true&#34;&#39; on
 * &#39;.metadata.annotations&#39; for the Service. Work to handle this case is in progress [2].
 * 
 * [1] https://kubernetes.io/docs/concepts/services-networking/service/#headless-services
 * [2] https://github.com/pulumi/pulumi-kubernetes/pull/703
 * 
 * If the Service has not reached a Ready state after 10 minutes, it will
 * time out and mark the resource update as Failed. You can override the default timeout value
 * by setting the &#39;customTimeouts&#39; option on the resource.
 * 
 */
public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
    private @Nullable Output<String> apiVersion;

    public Optional<Output<String>> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Spec defines the behavior of a service. https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="spec")
    private @Nullable Output<ServiceSpecArgs> spec;

    public Optional<Output<ServiceSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * Most recently observed status of the service. Populated by the system. Read-only. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="status")
    private @Nullable Output<ServiceStatusArgs> status;

    public Optional<Output<ServiceStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(ObjectMetaArgs metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder spec(@Nullable Output<ServiceSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(ServiceSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public Builder status(@Nullable Output<ServiceStatusArgs> status) {
            $.status = status;
            return this;
        }

        public Builder status(ServiceStatusArgs status) {
            return status(Output.of(status));
        }

        public ServiceArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
