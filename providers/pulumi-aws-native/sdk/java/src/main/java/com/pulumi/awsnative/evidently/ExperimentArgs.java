// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.evidently;

import com.pulumi.awsnative.evidently.inputs.ExperimentMetricGoalObjectArgs;
import com.pulumi.awsnative.evidently.inputs.ExperimentOnlineAbConfigObjectArgs;
import com.pulumi.awsnative.evidently.inputs.ExperimentTagArgs;
import com.pulumi.awsnative.evidently.inputs.ExperimentTreatmentObjectArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExperimentArgs extends ResourceArgs {

    public static final ExperimentArgs Empty = new ExperimentArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="metricGoals", required=true)
    private Output<List<ExperimentMetricGoalObjectArgs>> metricGoals;

    public Output<List<ExperimentMetricGoalObjectArgs>> metricGoals() {
        return this.metricGoals;
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="onlineAbConfig", required=true)
    private Output<ExperimentOnlineAbConfigObjectArgs> onlineAbConfig;

    public Output<ExperimentOnlineAbConfigObjectArgs> onlineAbConfig() {
        return this.onlineAbConfig;
    }

    @Import(name="project", required=true)
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }

    @Import(name="randomizationSalt")
    private @Nullable Output<String> randomizationSalt;

    public Optional<Output<String>> randomizationSalt() {
        return Optional.ofNullable(this.randomizationSalt);
    }

    @Import(name="samplingRate")
    private @Nullable Output<Integer> samplingRate;

    public Optional<Output<Integer>> samplingRate() {
        return Optional.ofNullable(this.samplingRate);
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ExperimentTagArgs>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Optional<Output<List<ExperimentTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="treatments", required=true)
    private Output<List<ExperimentTreatmentObjectArgs>> treatments;

    public Output<List<ExperimentTreatmentObjectArgs>> treatments() {
        return this.treatments;
    }

    private ExperimentArgs() {}

    private ExperimentArgs(ExperimentArgs $) {
        this.description = $.description;
        this.metricGoals = $.metricGoals;
        this.name = $.name;
        this.onlineAbConfig = $.onlineAbConfig;
        this.project = $.project;
        this.randomizationSalt = $.randomizationSalt;
        this.samplingRate = $.samplingRate;
        this.tags = $.tags;
        this.treatments = $.treatments;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExperimentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExperimentArgs $;

        public Builder() {
            $ = new ExperimentArgs();
        }

        public Builder(ExperimentArgs defaults) {
            $ = new ExperimentArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder metricGoals(Output<List<ExperimentMetricGoalObjectArgs>> metricGoals) {
            $.metricGoals = metricGoals;
            return this;
        }

        public Builder metricGoals(List<ExperimentMetricGoalObjectArgs> metricGoals) {
            return metricGoals(Output.of(metricGoals));
        }

        public Builder metricGoals(ExperimentMetricGoalObjectArgs... metricGoals) {
            return metricGoals(List.of(metricGoals));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder onlineAbConfig(Output<ExperimentOnlineAbConfigObjectArgs> onlineAbConfig) {
            $.onlineAbConfig = onlineAbConfig;
            return this;
        }

        public Builder onlineAbConfig(ExperimentOnlineAbConfigObjectArgs onlineAbConfig) {
            return onlineAbConfig(Output.of(onlineAbConfig));
        }

        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder randomizationSalt(@Nullable Output<String> randomizationSalt) {
            $.randomizationSalt = randomizationSalt;
            return this;
        }

        public Builder randomizationSalt(String randomizationSalt) {
            return randomizationSalt(Output.of(randomizationSalt));
        }

        public Builder samplingRate(@Nullable Output<Integer> samplingRate) {
            $.samplingRate = samplingRate;
            return this;
        }

        public Builder samplingRate(Integer samplingRate) {
            return samplingRate(Output.of(samplingRate));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ExperimentTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ExperimentTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags An array of key-value pairs to apply to this resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(ExperimentTagArgs... tags) {
            return tags(List.of(tags));
        }

        public Builder treatments(Output<List<ExperimentTreatmentObjectArgs>> treatments) {
            $.treatments = treatments;
            return this;
        }

        public Builder treatments(List<ExperimentTreatmentObjectArgs> treatments) {
            return treatments(Output.of(treatments));
        }

        public Builder treatments(ExperimentTreatmentObjectArgs... treatments) {
            return treatments(List.of(treatments));
        }

        public ExperimentArgs build() {
            $.metricGoals = Objects.requireNonNull($.metricGoals, "expected parameter 'metricGoals' to be non-null");
            $.onlineAbConfig = Objects.requireNonNull($.onlineAbConfig, "expected parameter 'onlineAbConfig' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            $.treatments = Objects.requireNonNull($.treatments, "expected parameter 'treatments' to be non-null");
            return $;
        }
    }

}
