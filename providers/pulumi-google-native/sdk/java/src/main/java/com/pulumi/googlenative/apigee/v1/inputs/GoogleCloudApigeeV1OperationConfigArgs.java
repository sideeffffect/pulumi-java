// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleCloudApigeeV1AttributeArgs;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleCloudApigeeV1OperationArgs;
import com.pulumi.googlenative.apigee.v1.inputs.GoogleCloudApigeeV1QuotaArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Binds the resources in an API proxy or remote service with the allowed REST methods and associated quota enforcement.
 * 
 */
public final class GoogleCloudApigeeV1OperationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudApigeeV1OperationConfigArgs Empty = new GoogleCloudApigeeV1OperationConfigArgs();

    /**
     * Name of the API proxy or remote service with which the resources, methods, and quota are associated.
     * 
     */
    @Import(name="apiSource", required=true)
    private Output<String> apiSource;

    /**
     * @return Name of the API proxy or remote service with which the resources, methods, and quota are associated.
     * 
     */
    public Output<String> apiSource() {
        return this.apiSource;
    }

    /**
     * Custom attributes associated with the operation.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes;

    /**
     * @return Custom attributes associated with the operation.
     * 
     */
    public Optional<Output<List<GoogleCloudApigeeV1AttributeArgs>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * List of resource/method pairs for the API proxy or remote service to which quota will applied. **Note**: Currently, you can specify only a single resource/method pair. The call will fail if more than one resource/method pair is provided.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<GoogleCloudApigeeV1OperationArgs>> operations;

    /**
     * @return List of resource/method pairs for the API proxy or remote service to which quota will applied. **Note**: Currently, you can specify only a single resource/method pair. The call will fail if more than one resource/method pair is provided.
     * 
     */
    public Optional<Output<List<GoogleCloudApigeeV1OperationArgs>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * 
     */
    @Import(name="quota")
    private @Nullable Output<GoogleCloudApigeeV1QuotaArgs> quota;

    /**
     * @return Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
     * 
     */
    public Optional<Output<GoogleCloudApigeeV1QuotaArgs>> quota() {
        return Optional.ofNullable(this.quota);
    }

    private GoogleCloudApigeeV1OperationConfigArgs() {}

    private GoogleCloudApigeeV1OperationConfigArgs(GoogleCloudApigeeV1OperationConfigArgs $) {
        this.apiSource = $.apiSource;
        this.attributes = $.attributes;
        this.operations = $.operations;
        this.quota = $.quota;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1OperationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1OperationConfigArgs $;

        public Builder() {
            $ = new GoogleCloudApigeeV1OperationConfigArgs();
        }

        public Builder(GoogleCloudApigeeV1OperationConfigArgs defaults) {
            $ = new GoogleCloudApigeeV1OperationConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiSource Name of the API proxy or remote service with which the resources, methods, and quota are associated.
         * 
         * @return builder
         * 
         */
        public Builder apiSource(Output<String> apiSource) {
            $.apiSource = apiSource;
            return this;
        }

        /**
         * @param apiSource Name of the API proxy or remote service with which the resources, methods, and quota are associated.
         * 
         * @return builder
         * 
         */
        public Builder apiSource(String apiSource) {
            return apiSource(Output.of(apiSource));
        }

        /**
         * @param attributes Custom attributes associated with the operation.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<List<GoogleCloudApigeeV1AttributeArgs>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Custom attributes associated with the operation.
         * 
         * @return builder
         * 
         */
        public Builder attributes(List<GoogleCloudApigeeV1AttributeArgs> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param attributes Custom attributes associated with the operation.
         * 
         * @return builder
         * 
         */
        public Builder attributes(GoogleCloudApigeeV1AttributeArgs... attributes) {
            return attributes(List.of(attributes));
        }

        /**
         * @param operations List of resource/method pairs for the API proxy or remote service to which quota will applied. **Note**: Currently, you can specify only a single resource/method pair. The call will fail if more than one resource/method pair is provided.
         * 
         * @return builder
         * 
         */
        public Builder operations(@Nullable Output<List<GoogleCloudApigeeV1OperationArgs>> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations List of resource/method pairs for the API proxy or remote service to which quota will applied. **Note**: Currently, you can specify only a single resource/method pair. The call will fail if more than one resource/method pair is provided.
         * 
         * @return builder
         * 
         */
        public Builder operations(List<GoogleCloudApigeeV1OperationArgs> operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param operations List of resource/method pairs for the API proxy or remote service to which quota will applied. **Note**: Currently, you can specify only a single resource/method pair. The call will fail if more than one resource/method pair is provided.
         * 
         * @return builder
         * 
         */
        public Builder operations(GoogleCloudApigeeV1OperationArgs... operations) {
            return operations(List.of(operations));
        }

        /**
         * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
         * 
         * @return builder
         * 
         */
        public Builder quota(@Nullable Output<GoogleCloudApigeeV1QuotaArgs> quota) {
            $.quota = quota;
            return this;
        }

        /**
         * @param quota Quota parameters to be enforced for the resources, methods, and API source combination. If none are specified, quota enforcement will not be done.
         * 
         * @return builder
         * 
         */
        public Builder quota(GoogleCloudApigeeV1QuotaArgs quota) {
            return quota(Output.of(quota));
        }

        public GoogleCloudApigeeV1OperationConfigArgs build() {
            $.apiSource = Objects.requireNonNull($.apiSource, "expected parameter 'apiSource' to be non-null");
            return $;
        }
    }

}
