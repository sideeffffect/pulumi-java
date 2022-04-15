// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CompositeAlarmState extends io.pulumi.resources.ResourceArgs {

    public static final CompositeAlarmState Empty = new CompositeAlarmState();

    /**
     * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. Defaults to `true`.
     * 
     */
    @Import(name="actionsEnabled")
      private final @Nullable Output<Boolean> actionsEnabled;

    public Output<Boolean> actionsEnabled() {
        return this.actionsEnabled == null ? Codegen.empty() : this.actionsEnabled;
    }

    /**
     * The set of actions to execute when this alarm transitions to the `ALARM` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @Import(name="alarmActions")
      private final @Nullable Output<List<String>> alarmActions;

    public Output<List<String>> alarmActions() {
        return this.alarmActions == null ? Codegen.empty() : this.alarmActions;
    }

    /**
     * The description for the composite alarm.
     * 
     */
    @Import(name="alarmDescription")
      private final @Nullable Output<String> alarmDescription;

    public Output<String> alarmDescription() {
        return this.alarmDescription == null ? Codegen.empty() : this.alarmDescription;
    }

    /**
     * The name for the composite alarm. This name must be unique within the region.
     * 
     */
    @Import(name="alarmName")
      private final @Nullable Output<String> alarmName;

    public Output<String> alarmName() {
        return this.alarmName == null ? Codegen.empty() : this.alarmName;
    }

    /**
     * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For syntax, see [Creating a Composite Alarm](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/Create_Composite_Alarm.html). The maximum length is 10240 characters.
     * 
     */
    @Import(name="alarmRule")
      private final @Nullable Output<String> alarmRule;

    public Output<String> alarmRule() {
        return this.alarmRule == null ? Codegen.empty() : this.alarmRule;
    }

    /**
     * The ARN of the composite alarm.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The set of actions to execute when this alarm transitions to the `INSUFFICIENT_DATA` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @Import(name="insufficientDataActions")
      private final @Nullable Output<List<String>> insufficientDataActions;

    public Output<List<String>> insufficientDataActions() {
        return this.insufficientDataActions == null ? Codegen.empty() : this.insufficientDataActions;
    }

    /**
     * The set of actions to execute when this alarm transitions to an `OK` state from any other state. Each action is specified as an ARN. Up to 5 actions are allowed.
     * 
     */
    @Import(name="okActions")
      private final @Nullable Output<List<String>> okActions;

    public Output<List<String>> okActions() {
        return this.okActions == null ? Codegen.empty() : this.okActions;
    }

    /**
     * A map of tags to associate with the alarm. Up to 50 tags are allowed. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public CompositeAlarmState(
        @Nullable Output<Boolean> actionsEnabled,
        @Nullable Output<List<String>> alarmActions,
        @Nullable Output<String> alarmDescription,
        @Nullable Output<String> alarmName,
        @Nullable Output<String> alarmRule,
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> insufficientDataActions,
        @Nullable Output<List<String>> okActions,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.actionsEnabled = actionsEnabled;
        this.alarmActions = alarmActions;
        this.alarmDescription = alarmDescription;
        this.alarmName = alarmName;
        this.alarmRule = alarmRule;
        this.arn = arn;
        this.insufficientDataActions = insufficientDataActions;
        this.okActions = okActions;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CompositeAlarmState() {
        this.actionsEnabled = Codegen.empty();
        this.alarmActions = Codegen.empty();
        this.alarmDescription = Codegen.empty();
        this.alarmName = Codegen.empty();
        this.alarmRule = Codegen.empty();
        this.arn = Codegen.empty();
        this.insufficientDataActions = Codegen.empty();
        this.okActions = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompositeAlarmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> actionsEnabled;
        private @Nullable Output<List<String>> alarmActions;
        private @Nullable Output<String> alarmDescription;
        private @Nullable Output<String> alarmName;
        private @Nullable Output<String> alarmRule;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> insufficientDataActions;
        private @Nullable Output<List<String>> okActions;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CompositeAlarmState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionsEnabled = defaults.actionsEnabled;
    	      this.alarmActions = defaults.alarmActions;
    	      this.alarmDescription = defaults.alarmDescription;
    	      this.alarmName = defaults.alarmName;
    	      this.alarmRule = defaults.alarmRule;
    	      this.arn = defaults.arn;
    	      this.insufficientDataActions = defaults.insufficientDataActions;
    	      this.okActions = defaults.okActions;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder actionsEnabled(@Nullable Output<Boolean> actionsEnabled) {
            this.actionsEnabled = actionsEnabled;
            return this;
        }
        public Builder actionsEnabled(@Nullable Boolean actionsEnabled) {
            this.actionsEnabled = Codegen.ofNullable(actionsEnabled);
            return this;
        }
        public Builder alarmActions(@Nullable Output<List<String>> alarmActions) {
            this.alarmActions = alarmActions;
            return this;
        }
        public Builder alarmActions(@Nullable List<String> alarmActions) {
            this.alarmActions = Codegen.ofNullable(alarmActions);
            return this;
        }
        public Builder alarmActions(String... alarmActions) {
            return alarmActions(List.of(alarmActions));
        }
        public Builder alarmDescription(@Nullable Output<String> alarmDescription) {
            this.alarmDescription = alarmDescription;
            return this;
        }
        public Builder alarmDescription(@Nullable String alarmDescription) {
            this.alarmDescription = Codegen.ofNullable(alarmDescription);
            return this;
        }
        public Builder alarmName(@Nullable Output<String> alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public Builder alarmName(@Nullable String alarmName) {
            this.alarmName = Codegen.ofNullable(alarmName);
            return this;
        }
        public Builder alarmRule(@Nullable Output<String> alarmRule) {
            this.alarmRule = alarmRule;
            return this;
        }
        public Builder alarmRule(@Nullable String alarmRule) {
            this.alarmRule = Codegen.ofNullable(alarmRule);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder insufficientDataActions(@Nullable Output<List<String>> insufficientDataActions) {
            this.insufficientDataActions = insufficientDataActions;
            return this;
        }
        public Builder insufficientDataActions(@Nullable List<String> insufficientDataActions) {
            this.insufficientDataActions = Codegen.ofNullable(insufficientDataActions);
            return this;
        }
        public Builder insufficientDataActions(String... insufficientDataActions) {
            return insufficientDataActions(List.of(insufficientDataActions));
        }
        public Builder okActions(@Nullable Output<List<String>> okActions) {
            this.okActions = okActions;
            return this;
        }
        public Builder okActions(@Nullable List<String> okActions) {
            this.okActions = Codegen.ofNullable(okActions);
            return this;
        }
        public Builder okActions(String... okActions) {
            return okActions(List.of(okActions));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public CompositeAlarmState build() {
            return new CompositeAlarmState(actionsEnabled, alarmActions, alarmDescription, alarmName, alarmRule, arn, insufficientDataActions, okActions, tags, tagsAll);
        }
    }
}
