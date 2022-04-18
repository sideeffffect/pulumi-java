// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.JobErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobOutputAssetResponse {
    /**
     * The name of the output Asset.
     * 
     */
    private final String assetName;
    /**
     * The UTC date and time at which this Job Output finished processing.
     * 
     */
    private final String endTime;
    /**
     * If the JobOutput is in the Error state, it contains the details of the error.
     * 
     */
    private final JobErrorResponse error;
    /**
     * A label that is assigned to a JobOutput in order to help uniquely identify it. This is useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use the label to easily identify the JobOutput. If a label is not provided, a default value of '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this index is the same as the relative index of the corresponding TransformOutput within its Transform.
     * 
     */
    private final @Nullable String label;
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobOutputAsset'.
     * 
     */
    private final String odataType;
    /**
     * If the JobOutput is in a Processing state, this contains the Job completion percentage. The value is an estimate and not intended to be used to predict Job completion times. To determine if the JobOutput is complete, use the State property.
     * 
     */
    private final Integer progress;
    /**
     * The UTC date and time at which this Job Output began processing.
     * 
     */
    private final String startTime;
    /**
     * Describes the state of the JobOutput.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private JobOutputAssetResponse(
        @CustomType.Parameter("assetName") String assetName,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("error") JobErrorResponse error,
        @CustomType.Parameter("label") @Nullable String label,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("progress") Integer progress,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("state") String state) {
        this.assetName = assetName;
        this.endTime = endTime;
        this.error = error;
        this.label = label;
        this.odataType = odataType;
        this.progress = progress;
        this.startTime = startTime;
        this.state = state;
    }

    /**
     * The name of the output Asset.
     * 
    */
    public String assetName() {
        return this.assetName;
    }
    /**
     * The UTC date and time at which this Job Output finished processing.
     * 
    */
    public String endTime() {
        return this.endTime;
    }
    /**
     * If the JobOutput is in the Error state, it contains the details of the error.
     * 
    */
    public JobErrorResponse error() {
        return this.error;
    }
    /**
     * A label that is assigned to a JobOutput in order to help uniquely identify it. This is useful when your Transform has more than one TransformOutput, whereby your Job has more than one JobOutput. In such cases, when you submit the Job, you will add two or more JobOutputs, in the same order as TransformOutputs in the Transform. Subsequently, when you retrieve the Job, either through events or on a GET request, you can use the label to easily identify the JobOutput. If a label is not provided, a default value of '{presetName}_{outputIndex}' will be used, where the preset name is the name of the preset in the corresponding TransformOutput and the output index is the relative index of the this JobOutput within the Job. Note that this index is the same as the relative index of the corresponding TransformOutput within its Transform.
     * 
    */
    public Optional<String> label() {
        return Optional.ofNullable(this.label);
    }
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.JobOutputAsset'.
     * 
    */
    public String odataType() {
        return this.odataType;
    }
    /**
     * If the JobOutput is in a Processing state, this contains the Job completion percentage. The value is an estimate and not intended to be used to predict Job completion times. To determine if the JobOutput is complete, use the State property.
     * 
    */
    public Integer progress() {
        return this.progress;
    }
    /**
     * The UTC date and time at which this Job Output began processing.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * Describes the state of the JobOutput.
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobOutputAssetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assetName;
        private String endTime;
        private JobErrorResponse error;
        private @Nullable String label;
        private String odataType;
        private Integer progress;
        private String startTime;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobOutputAssetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assetName = defaults.assetName;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.label = defaults.label;
    	      this.odataType = defaults.odataType;
    	      this.progress = defaults.progress;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
        }

        public Builder assetName(String assetName) {
            this.assetName = Objects.requireNonNull(assetName);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder error(JobErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder label(@Nullable String label) {
            this.label = label;
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder progress(Integer progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public JobOutputAssetResponse build() {
            return new JobOutputAssetResponse(assetName, endTime, error, label, odataType, progress, startTime, state);
        }
    }
}
