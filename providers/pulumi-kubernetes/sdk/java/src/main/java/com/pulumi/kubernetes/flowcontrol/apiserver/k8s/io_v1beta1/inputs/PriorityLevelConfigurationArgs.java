// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.PriorityLevelConfigurationSpecArgs;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1beta1.inputs.PriorityLevelConfigurationStatusArgs;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfiguration represents the configuration of a priority level.
 * 
 */
public final class PriorityLevelConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationArgs Empty = new PriorityLevelConfigurationArgs();

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
     * `metadata` is the standard object&#39;s metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<ObjectMetaArgs> metadata;

    public Optional<Output<ObjectMetaArgs>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * `spec` is the specification of the desired behavior of a &#34;request-priority&#34;. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="spec")
    private @Nullable Output<PriorityLevelConfigurationSpecArgs> spec;

    public Optional<Output<PriorityLevelConfigurationSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * `status` is the current status of a &#34;request-priority&#34;. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
     * 
     */
    @Import(name="status")
    private @Nullable Output<PriorityLevelConfigurationStatusArgs> status;

    public Optional<Output<PriorityLevelConfigurationStatusArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    private PriorityLevelConfigurationArgs() {}

    private PriorityLevelConfigurationArgs(PriorityLevelConfigurationArgs $) {
        this.apiVersion = $.apiVersion;
        this.kind = $.kind;
        this.metadata = $.metadata;
        this.spec = $.spec;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PriorityLevelConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PriorityLevelConfigurationArgs $;

        public Builder() {
            $ = new PriorityLevelConfigurationArgs();
        }

        public Builder(PriorityLevelConfigurationArgs defaults) {
            $ = new PriorityLevelConfigurationArgs(Objects.requireNonNull(defaults));
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

        public Builder spec(@Nullable Output<PriorityLevelConfigurationSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(PriorityLevelConfigurationSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public Builder status(@Nullable Output<PriorityLevelConfigurationStatusArgs> status) {
            $.status = status;
            return this;
        }

        public Builder status(PriorityLevelConfigurationStatusArgs status) {
            return status(Output.of(status));
        }

        public PriorityLevelConfigurationArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
