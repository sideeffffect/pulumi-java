// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigMapArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConfigMapArgs Empty = new ConfigMapArgs();

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
     * BinaryData contains the binary data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. BinaryData can contain byte sequences that are not in the UTF-8 range. The keys stored in BinaryData must not overlap with the ones in the Data field, this is enforced during validation process. Using this field will require 1.10+ apiserver and kubelet.
     * 
     */
    @Import(name="binaryData")
    private @Nullable Output<Map<String,String>> binaryData;

    public Optional<Output<Map<String,String>>> binaryData() {
        return Optional.ofNullable(this.binaryData);
    }

    /**
     * Data contains the configuration data. Each key must consist of alphanumeric characters, &#39;-&#39;, &#39;_&#39; or &#39;.&#39;. Values with non-UTF-8 byte sequences must use the BinaryData field. The keys stored in Data must not overlap with the keys in the BinaryData field, this is enforced during validation process.
     * 
     */
    @Import(name="data")
    private @Nullable Output<Map<String,String>> data;

    public Optional<Output<Map<String,String>>> data() {
        return Optional.ofNullable(this.data);
    }

    /**
     * Immutable, if set to true, ensures that data stored in the ConfigMap cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.
     * 
     */
    @Import(name="immutable")
    private @Nullable Output<Boolean> immutable;

    public Optional<Output<Boolean>> immutable() {
        return Optional.ofNullable(this.immutable);
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

    private ConfigMapArgs() {}

    private ConfigMapArgs(ConfigMapArgs $) {
        this.apiVersion = $.apiVersion;
        this.binaryData = $.binaryData;
        this.data = $.data;
        this.immutable = $.immutable;
        this.kind = $.kind;
        this.metadata = $.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigMapArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigMapArgs $;

        public Builder() {
            $ = new ConfigMapArgs();
        }

        public Builder(ConfigMapArgs defaults) {
            $ = new ConfigMapArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(String apiVersion) {
            return apiVersion(Output.of(apiVersion));
        }

        public Builder binaryData(@Nullable Output<Map<String,String>> binaryData) {
            $.binaryData = binaryData;
            return this;
        }

        public Builder binaryData(Map<String,String> binaryData) {
            return binaryData(Output.of(binaryData));
        }

        public Builder data(@Nullable Output<Map<String,String>> data) {
            $.data = data;
            return this;
        }

        public Builder data(Map<String,String> data) {
            return data(Output.of(data));
        }

        public Builder immutable(@Nullable Output<Boolean> immutable) {
            $.immutable = immutable;
            return this;
        }

        public Builder immutable(Boolean immutable) {
            return immutable(Output.of(immutable));
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

        public ConfigMapArgs build() {
            $.apiVersion = Codegen.stringProp("apiVersion").output().arg($.apiVersion).getNullable();
            $.kind = Codegen.stringProp("kind").output().arg($.kind).getNullable();
            return $;
        }
    }

}
