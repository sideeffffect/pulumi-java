// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupTypeEnum;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupArgs Empty = new RuleGroupArgs();

    @InputImport(name="capacity", required=true)
      private final Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity;
    }

    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="ruleGroup")
      private final @Nullable Input<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup;

    public Input<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> getRuleGroup() {
        return this.ruleGroup == null ? Input.empty() : this.ruleGroup;
    }

    @InputImport(name="ruleGroupName")
      private final @Nullable Input<String> ruleGroupName;

    public Input<String> getRuleGroupName() {
        return this.ruleGroupName == null ? Input.empty() : this.ruleGroupName;
    }

    @InputImport(name="tags")
      private final @Nullable Input<List<RuleGroupTagArgs>> tags;

    public Input<List<RuleGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="type", required=true)
      private final Input<RuleGroupTypeEnum> type;

    public Input<RuleGroupTypeEnum> getType() {
        return this.type;
    }

    public RuleGroupArgs(
        Input<Integer> capacity,
        @Nullable Input<String> description,
        @Nullable Input<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup,
        @Nullable Input<String> ruleGroupName,
        @Nullable Input<List<RuleGroupTagArgs>> tags,
        Input<RuleGroupTypeEnum> type) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.description = description;
        this.ruleGroup = ruleGroup;
        this.ruleGroupName = ruleGroupName;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuleGroupArgs() {
        this.capacity = Input.empty();
        this.description = Input.empty();
        this.ruleGroup = Input.empty();
        this.ruleGroupName = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> capacity;
        private @Nullable Input<String> description;
        private @Nullable Input<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup;
        private @Nullable Input<String> ruleGroupName;
        private @Nullable Input<List<RuleGroupTagArgs>> tags;
        private Input<RuleGroupTypeEnum> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.description = defaults.description;
    	      this.ruleGroup = defaults.ruleGroup;
    	      this.ruleGroupName = defaults.ruleGroupName;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder capacity(Input<Integer> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder capacity(Integer capacity) {
            this.capacity = Input.of(Objects.requireNonNull(capacity));
            return this;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder ruleGroup(@Nullable Input<io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs> ruleGroup) {
            this.ruleGroup = ruleGroup;
            return this;
        }

        public Builder ruleGroup(@Nullable io.pulumi.awsnative.networkfirewall.inputs.RuleGroupArgs ruleGroup) {
            this.ruleGroup = Input.ofNullable(ruleGroup);
            return this;
        }

        public Builder ruleGroupName(@Nullable Input<String> ruleGroupName) {
            this.ruleGroupName = ruleGroupName;
            return this;
        }

        public Builder ruleGroupName(@Nullable String ruleGroupName) {
            this.ruleGroupName = Input.ofNullable(ruleGroupName);
            return this;
        }

        public Builder tags(@Nullable Input<List<RuleGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<RuleGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(Input<RuleGroupTypeEnum> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(RuleGroupTypeEnum type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public RuleGroupArgs build() {
            return new RuleGroupArgs(capacity, description, ruleGroup, ruleGroupName, tags, type);
        }
    }
}
