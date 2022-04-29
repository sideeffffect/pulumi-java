// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusConditionArgs;
import com.pulumi.gcp.cloudrun.inputs.DomainMappingStatusResourceRecordArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainMappingStatusArgs extends ResourceArgs {

    public static final DomainMappingStatusArgs Empty = new DomainMappingStatusArgs();

    @Import(name="conditions")
    private @Nullable Output<List<DomainMappingStatusConditionArgs>> conditions;

    public Optional<Output<List<DomainMappingStatusConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    @Import(name="mappedRouteName")
    private @Nullable Output<String> mappedRouteName;

    public Optional<Output<String>> mappedRouteName() {
        return Optional.ofNullable(this.mappedRouteName);
    }

    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    @Import(name="resourceRecords")
    private @Nullable Output<List<DomainMappingStatusResourceRecordArgs>> resourceRecords;

    public Optional<Output<List<DomainMappingStatusResourceRecordArgs>>> resourceRecords() {
        return Optional.ofNullable(this.resourceRecords);
    }

    private DomainMappingStatusArgs() {}

    private DomainMappingStatusArgs(DomainMappingStatusArgs $) {
        this.conditions = $.conditions;
        this.mappedRouteName = $.mappedRouteName;
        this.observedGeneration = $.observedGeneration;
        this.resourceRecords = $.resourceRecords;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainMappingStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainMappingStatusArgs $;

        public Builder() {
            $ = new DomainMappingStatusArgs();
        }

        public Builder(DomainMappingStatusArgs defaults) {
            $ = new DomainMappingStatusArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditions(@Nullable Output<List<DomainMappingStatusConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        public Builder conditions(List<DomainMappingStatusConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        public Builder conditions(DomainMappingStatusConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        public Builder mappedRouteName(@Nullable Output<String> mappedRouteName) {
            $.mappedRouteName = mappedRouteName;
            return this;
        }

        public Builder mappedRouteName(String mappedRouteName) {
            return mappedRouteName(Output.of(mappedRouteName));
        }

        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        public Builder resourceRecords(@Nullable Output<List<DomainMappingStatusResourceRecordArgs>> resourceRecords) {
            $.resourceRecords = resourceRecords;
            return this;
        }

        public Builder resourceRecords(List<DomainMappingStatusResourceRecordArgs> resourceRecords) {
            return resourceRecords(Output.of(resourceRecords));
        }

        public Builder resourceRecords(DomainMappingStatusResourceRecordArgs... resourceRecords) {
            return resourceRecords(List.of(resourceRecords));
        }

        public DomainMappingStatusArgs build() {
            return $;
        }
    }

}
