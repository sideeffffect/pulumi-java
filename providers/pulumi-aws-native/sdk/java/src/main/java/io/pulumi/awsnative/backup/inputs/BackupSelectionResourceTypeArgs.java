// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.awsnative.backup.inputs.BackupSelectionConditionResourceTypeArgs;
import io.pulumi.awsnative.backup.inputs.BackupSelectionResourceTypeConditionsPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackupSelectionResourceTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupSelectionResourceTypeArgs Empty = new BackupSelectionResourceTypeArgs();

    @InputImport(name="conditions")
      private final @Nullable Input<BackupSelectionResourceTypeConditionsPropertiesArgs> conditions;

    public Input<BackupSelectionResourceTypeConditionsPropertiesArgs> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    @InputImport(name="iamRoleArn", required=true)
      private final Input<String> iamRoleArn;

    public Input<String> getIamRoleArn() {
        return this.iamRoleArn;
    }

    @InputImport(name="listOfTags")
      private final @Nullable Input<List<BackupSelectionConditionResourceTypeArgs>> listOfTags;

    public Input<List<BackupSelectionConditionResourceTypeArgs>> getListOfTags() {
        return this.listOfTags == null ? Input.empty() : this.listOfTags;
    }

    @InputImport(name="notResources")
      private final @Nullable Input<List<String>> notResources;

    public Input<List<String>> getNotResources() {
        return this.notResources == null ? Input.empty() : this.notResources;
    }

    @InputImport(name="resources")
      private final @Nullable Input<List<String>> resources;

    public Input<List<String>> getResources() {
        return this.resources == null ? Input.empty() : this.resources;
    }

    @InputImport(name="selectionName", required=true)
      private final Input<String> selectionName;

    public Input<String> getSelectionName() {
        return this.selectionName;
    }

    public BackupSelectionResourceTypeArgs(
        @Nullable Input<BackupSelectionResourceTypeConditionsPropertiesArgs> conditions,
        Input<String> iamRoleArn,
        @Nullable Input<List<BackupSelectionConditionResourceTypeArgs>> listOfTags,
        @Nullable Input<List<String>> notResources,
        @Nullable Input<List<String>> resources,
        Input<String> selectionName) {
        this.conditions = conditions;
        this.iamRoleArn = Objects.requireNonNull(iamRoleArn, "expected parameter 'iamRoleArn' to be non-null");
        this.listOfTags = listOfTags;
        this.notResources = notResources;
        this.resources = resources;
        this.selectionName = Objects.requireNonNull(selectionName, "expected parameter 'selectionName' to be non-null");
    }

    private BackupSelectionResourceTypeArgs() {
        this.conditions = Input.empty();
        this.iamRoleArn = Input.empty();
        this.listOfTags = Input.empty();
        this.notResources = Input.empty();
        this.resources = Input.empty();
        this.selectionName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupSelectionResourceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BackupSelectionResourceTypeConditionsPropertiesArgs> conditions;
        private Input<String> iamRoleArn;
        private @Nullable Input<List<BackupSelectionConditionResourceTypeArgs>> listOfTags;
        private @Nullable Input<List<String>> notResources;
        private @Nullable Input<List<String>> resources;
        private Input<String> selectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupSelectionResourceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.iamRoleArn = defaults.iamRoleArn;
    	      this.listOfTags = defaults.listOfTags;
    	      this.notResources = defaults.notResources;
    	      this.resources = defaults.resources;
    	      this.selectionName = defaults.selectionName;
        }

        public Builder conditions(@Nullable Input<BackupSelectionResourceTypeConditionsPropertiesArgs> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable BackupSelectionResourceTypeConditionsPropertiesArgs conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder iamRoleArn(Input<String> iamRoleArn) {
            this.iamRoleArn = Objects.requireNonNull(iamRoleArn);
            return this;
        }

        public Builder iamRoleArn(String iamRoleArn) {
            this.iamRoleArn = Input.of(Objects.requireNonNull(iamRoleArn));
            return this;
        }

        public Builder listOfTags(@Nullable Input<List<BackupSelectionConditionResourceTypeArgs>> listOfTags) {
            this.listOfTags = listOfTags;
            return this;
        }

        public Builder listOfTags(@Nullable List<BackupSelectionConditionResourceTypeArgs> listOfTags) {
            this.listOfTags = Input.ofNullable(listOfTags);
            return this;
        }

        public Builder notResources(@Nullable Input<List<String>> notResources) {
            this.notResources = notResources;
            return this;
        }

        public Builder notResources(@Nullable List<String> notResources) {
            this.notResources = Input.ofNullable(notResources);
            return this;
        }

        public Builder resources(@Nullable Input<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable List<String> resources) {
            this.resources = Input.ofNullable(resources);
            return this;
        }

        public Builder selectionName(Input<String> selectionName) {
            this.selectionName = Objects.requireNonNull(selectionName);
            return this;
        }

        public Builder selectionName(String selectionName) {
            this.selectionName = Input.of(Objects.requireNonNull(selectionName));
            return this;
        }
        public BackupSelectionResourceTypeArgs build() {
            return new BackupSelectionResourceTypeArgs(conditions, iamRoleArn, listOfTags, notResources, resources, selectionName);
        }
    }
}
