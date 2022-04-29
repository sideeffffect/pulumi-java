// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


public final class BackupSelectionConditionResourceTypeArgs extends ResourceArgs {

    public static final BackupSelectionConditionResourceTypeArgs Empty = new BackupSelectionConditionResourceTypeArgs();

    @Import(name="conditionKey", required=true)
    private Output<String> conditionKey;

    public Output<String> conditionKey() {
        return this.conditionKey;
    }

    @Import(name="conditionType", required=true)
    private Output<String> conditionType;

    public Output<String> conditionType() {
        return this.conditionType;
    }

    @Import(name="conditionValue", required=true)
    private Output<String> conditionValue;

    public Output<String> conditionValue() {
        return this.conditionValue;
    }

    private BackupSelectionConditionResourceTypeArgs() {}

    private BackupSelectionConditionResourceTypeArgs(BackupSelectionConditionResourceTypeArgs $) {
        this.conditionKey = $.conditionKey;
        this.conditionType = $.conditionType;
        this.conditionValue = $.conditionValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackupSelectionConditionResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackupSelectionConditionResourceTypeArgs $;

        public Builder() {
            $ = new BackupSelectionConditionResourceTypeArgs();
        }

        public Builder(BackupSelectionConditionResourceTypeArgs defaults) {
            $ = new BackupSelectionConditionResourceTypeArgs(Objects.requireNonNull(defaults));
        }

        public Builder conditionKey(Output<String> conditionKey) {
            $.conditionKey = conditionKey;
            return this;
        }

        public Builder conditionKey(String conditionKey) {
            return conditionKey(Output.of(conditionKey));
        }

        public Builder conditionType(Output<String> conditionType) {
            $.conditionType = conditionType;
            return this;
        }

        public Builder conditionType(String conditionType) {
            return conditionType(Output.of(conditionType));
        }

        public Builder conditionValue(Output<String> conditionValue) {
            $.conditionValue = conditionValue;
            return this;
        }

        public Builder conditionValue(String conditionValue) {
            return conditionValue(Output.of(conditionValue));
        }

        public BackupSelectionConditionResourceTypeArgs build() {
            $.conditionKey = Objects.requireNonNull($.conditionKey, "expected parameter 'conditionKey' to be non-null");
            $.conditionType = Objects.requireNonNull($.conditionType, "expected parameter 'conditionType' to be non-null");
            $.conditionValue = Objects.requireNonNull($.conditionValue, "expected parameter 'conditionValue' to be non-null");
            return $;
        }
    }

}
