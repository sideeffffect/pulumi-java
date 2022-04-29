// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lookoutmetrics.inputs;

import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorCsvFormatDescriptorArgs;
import com.pulumi.awsnative.lookoutmetrics.inputs.AnomalyDetectorJsonFormatDescriptorArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AnomalyDetectorFileFormatDescriptorArgs extends ResourceArgs {

    public static final AnomalyDetectorFileFormatDescriptorArgs Empty = new AnomalyDetectorFileFormatDescriptorArgs();

    @Import(name="csvFormatDescriptor")
    private @Nullable Output<AnomalyDetectorCsvFormatDescriptorArgs> csvFormatDescriptor;

    public Optional<Output<AnomalyDetectorCsvFormatDescriptorArgs>> csvFormatDescriptor() {
        return Optional.ofNullable(this.csvFormatDescriptor);
    }

    @Import(name="jsonFormatDescriptor")
    private @Nullable Output<AnomalyDetectorJsonFormatDescriptorArgs> jsonFormatDescriptor;

    public Optional<Output<AnomalyDetectorJsonFormatDescriptorArgs>> jsonFormatDescriptor() {
        return Optional.ofNullable(this.jsonFormatDescriptor);
    }

    private AnomalyDetectorFileFormatDescriptorArgs() {}

    private AnomalyDetectorFileFormatDescriptorArgs(AnomalyDetectorFileFormatDescriptorArgs $) {
        this.csvFormatDescriptor = $.csvFormatDescriptor;
        this.jsonFormatDescriptor = $.jsonFormatDescriptor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AnomalyDetectorFileFormatDescriptorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AnomalyDetectorFileFormatDescriptorArgs $;

        public Builder() {
            $ = new AnomalyDetectorFileFormatDescriptorArgs();
        }

        public Builder(AnomalyDetectorFileFormatDescriptorArgs defaults) {
            $ = new AnomalyDetectorFileFormatDescriptorArgs(Objects.requireNonNull(defaults));
        }

        public Builder csvFormatDescriptor(@Nullable Output<AnomalyDetectorCsvFormatDescriptorArgs> csvFormatDescriptor) {
            $.csvFormatDescriptor = csvFormatDescriptor;
            return this;
        }

        public Builder csvFormatDescriptor(AnomalyDetectorCsvFormatDescriptorArgs csvFormatDescriptor) {
            return csvFormatDescriptor(Output.of(csvFormatDescriptor));
        }

        public Builder jsonFormatDescriptor(@Nullable Output<AnomalyDetectorJsonFormatDescriptorArgs> jsonFormatDescriptor) {
            $.jsonFormatDescriptor = jsonFormatDescriptor;
            return this;
        }

        public Builder jsonFormatDescriptor(AnomalyDetectorJsonFormatDescriptorArgs jsonFormatDescriptor) {
            return jsonFormatDescriptor(Output.of(jsonFormatDescriptor));
        }

        public AnomalyDetectorFileFormatDescriptorArgs build() {
            return $;
        }
    }

}
