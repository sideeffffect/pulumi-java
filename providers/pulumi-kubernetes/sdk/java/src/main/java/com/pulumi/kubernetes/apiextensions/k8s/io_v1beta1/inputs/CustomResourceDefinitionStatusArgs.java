// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionConditionArgs;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionNamesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
 * 
 */
public final class CustomResourceDefinitionStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionStatusArgs Empty = new CustomResourceDefinitionStatusArgs();

    /**
     * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
     * 
     */
    @Import(name="acceptedNames", required=true)
      private final Output<CustomResourceDefinitionNamesArgs> acceptedNames;

    public Output<CustomResourceDefinitionNamesArgs> acceptedNames() {
        return this.acceptedNames;
    }

    /**
     * conditions indicate state for particular aspects of a CustomResourceDefinition
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<CustomResourceDefinitionConditionArgs>> conditions;

    public Output<List<CustomResourceDefinitionConditionArgs>> conditions() {
        return this.conditions == null ? Codegen.empty() : this.conditions;
    }

    /**
     * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
     * 
     */
    @Import(name="storedVersions", required=true)
      private final Output<List<String>> storedVersions;

    public Output<List<String>> storedVersions() {
        return this.storedVersions;
    }

    public CustomResourceDefinitionStatusArgs(
        Output<CustomResourceDefinitionNamesArgs> acceptedNames,
        @Nullable Output<List<CustomResourceDefinitionConditionArgs>> conditions,
        Output<List<String>> storedVersions) {
        this.acceptedNames = Objects.requireNonNull(acceptedNames, "expected parameter 'acceptedNames' to be non-null");
        this.conditions = conditions;
        this.storedVersions = Objects.requireNonNull(storedVersions, "expected parameter 'storedVersions' to be non-null");
    }

    private CustomResourceDefinitionStatusArgs() {
        this.acceptedNames = Codegen.empty();
        this.conditions = Codegen.empty();
        this.storedVersions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<CustomResourceDefinitionNamesArgs> acceptedNames;
        private @Nullable Output<List<CustomResourceDefinitionConditionArgs>> conditions;
        private Output<List<String>> storedVersions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedNames = defaults.acceptedNames;
    	      this.conditions = defaults.conditions;
    	      this.storedVersions = defaults.storedVersions;
        }

        public Builder acceptedNames(Output<CustomResourceDefinitionNamesArgs> acceptedNames) {
            this.acceptedNames = Objects.requireNonNull(acceptedNames);
            return this;
        }
        public Builder acceptedNames(CustomResourceDefinitionNamesArgs acceptedNames) {
            this.acceptedNames = Output.of(Objects.requireNonNull(acceptedNames));
            return this;
        }
        public Builder conditions(@Nullable Output<List<CustomResourceDefinitionConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(@Nullable List<CustomResourceDefinitionConditionArgs> conditions) {
            this.conditions = Codegen.ofNullable(conditions);
            return this;
        }
        public Builder conditions(CustomResourceDefinitionConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder storedVersions(Output<List<String>> storedVersions) {
            this.storedVersions = Objects.requireNonNull(storedVersions);
            return this;
        }
        public Builder storedVersions(List<String> storedVersions) {
            this.storedVersions = Output.of(Objects.requireNonNull(storedVersions));
            return this;
        }
        public Builder storedVersions(String... storedVersions) {
            return storedVersions(List.of(storedVersions));
        }        public CustomResourceDefinitionStatusArgs build() {
            return new CustomResourceDefinitionStatusArgs(acceptedNames, conditions, storedVersions);
        }
    }
}
