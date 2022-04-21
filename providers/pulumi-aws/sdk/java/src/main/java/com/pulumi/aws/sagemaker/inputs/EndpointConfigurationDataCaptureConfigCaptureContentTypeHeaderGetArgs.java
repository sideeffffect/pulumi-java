// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs Empty = new EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs();

    /**
     * The CSV content type headers to capture.
     * 
     */
    @Import(name="csvContentTypes")
    private @Nullable Output<List<String>> csvContentTypes;

    public Optional<Output<List<String>>> csvContentTypes() {
        return Optional.ofNullable(this.csvContentTypes);
    }

    /**
     * The JSON content type headers to capture.
     * 
     */
    @Import(name="jsonContentTypes")
    private @Nullable Output<List<String>> jsonContentTypes;

    public Optional<Output<List<String>>> jsonContentTypes() {
        return Optional.ofNullable(this.jsonContentTypes);
    }

    private EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs() {}

    private EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs $) {
        this.csvContentTypes = $.csvContentTypes;
        this.jsonContentTypes = $.jsonContentTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs $;

        public Builder() {
            $ = new EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs();
        }

        public Builder(EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs defaults) {
            $ = new EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder csvContentTypes(@Nullable Output<List<String>> csvContentTypes) {
            $.csvContentTypes = csvContentTypes;
            return this;
        }

        public Builder csvContentTypes(List<String> csvContentTypes) {
            return csvContentTypes(Output.of(csvContentTypes));
        }

        public Builder csvContentTypes(String... csvContentTypes) {
            return csvContentTypes(List.of(csvContentTypes));
        }

        public Builder jsonContentTypes(@Nullable Output<List<String>> jsonContentTypes) {
            $.jsonContentTypes = jsonContentTypes;
            return this;
        }

        public Builder jsonContentTypes(List<String> jsonContentTypes) {
            return jsonContentTypes(Output.of(jsonContentTypes));
        }

        public Builder jsonContentTypes(String... jsonContentTypes) {
            return jsonContentTypes(List.of(jsonContentTypes));
        }

        public EndpointConfigurationDataCaptureConfigCaptureContentTypeHeaderGetArgs build() {
            return $;
        }
    }

}
