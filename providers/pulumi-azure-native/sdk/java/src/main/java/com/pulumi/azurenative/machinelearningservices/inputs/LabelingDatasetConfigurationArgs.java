// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents configuration of dataset used in a labeling job.
 * 
 */
public final class LabelingDatasetConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LabelingDatasetConfigurationArgs Empty = new LabelingDatasetConfigurationArgs();

    /**
     * Name of the data asset to perform labeling.
     * 
     */
    @Import(name="assetName", required=true)
    private Output<String> assetName;

    /**
     * @return Name of the data asset to perform labeling.
     * 
     */
    public Output<String> assetName() {
        return this.assetName;
    }

    /**
     * AML dataset version.
     * 
     */
    @Import(name="datasetVersion", required=true)
    private Output<String> datasetVersion;

    /**
     * @return AML dataset version.
     * 
     */
    public Output<String> datasetVersion() {
        return this.datasetVersion;
    }

    /**
     * Indicates whether to enable incremental dataset refresh.
     * 
     */
    @Import(name="enableIncrementalDatasetRefresh")
    private @Nullable Output<Boolean> enableIncrementalDatasetRefresh;

    /**
     * @return Indicates whether to enable incremental dataset refresh.
     * 
     */
    public Optional<Output<Boolean>> enableIncrementalDatasetRefresh() {
        return Optional.ofNullable(this.enableIncrementalDatasetRefresh);
    }

    private LabelingDatasetConfigurationArgs() {}

    private LabelingDatasetConfigurationArgs(LabelingDatasetConfigurationArgs $) {
        this.assetName = $.assetName;
        this.datasetVersion = $.datasetVersion;
        this.enableIncrementalDatasetRefresh = $.enableIncrementalDatasetRefresh;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelingDatasetConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelingDatasetConfigurationArgs $;

        public Builder() {
            $ = new LabelingDatasetConfigurationArgs();
        }

        public Builder(LabelingDatasetConfigurationArgs defaults) {
            $ = new LabelingDatasetConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assetName Name of the data asset to perform labeling.
         * 
         * @return builder
         * 
         */
        public Builder assetName(Output<String> assetName) {
            $.assetName = assetName;
            return this;
        }

        /**
         * @param assetName Name of the data asset to perform labeling.
         * 
         * @return builder
         * 
         */
        public Builder assetName(String assetName) {
            return assetName(Output.of(assetName));
        }

        /**
         * @param datasetVersion AML dataset version.
         * 
         * @return builder
         * 
         */
        public Builder datasetVersion(Output<String> datasetVersion) {
            $.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * @param datasetVersion AML dataset version.
         * 
         * @return builder
         * 
         */
        public Builder datasetVersion(String datasetVersion) {
            return datasetVersion(Output.of(datasetVersion));
        }

        /**
         * @param enableIncrementalDatasetRefresh Indicates whether to enable incremental dataset refresh.
         * 
         * @return builder
         * 
         */
        public Builder enableIncrementalDatasetRefresh(@Nullable Output<Boolean> enableIncrementalDatasetRefresh) {
            $.enableIncrementalDatasetRefresh = enableIncrementalDatasetRefresh;
            return this;
        }

        /**
         * @param enableIncrementalDatasetRefresh Indicates whether to enable incremental dataset refresh.
         * 
         * @return builder
         * 
         */
        public Builder enableIncrementalDatasetRefresh(Boolean enableIncrementalDatasetRefresh) {
            return enableIncrementalDatasetRefresh(Output.of(enableIncrementalDatasetRefresh));
        }

        public LabelingDatasetConfigurationArgs build() {
            $.assetName = Objects.requireNonNull($.assetName, "expected parameter 'assetName' to be non-null");
            $.datasetVersion = Objects.requireNonNull($.datasetVersion, "expected parameter 'datasetVersion' to be non-null");
            return $;
        }
    }

}
