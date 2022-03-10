// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateParameterValidationGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateParameterGetArgs Empty = new WorkflowTemplateParameterGetArgs();

    /**
     * Optional. Brief description of the parameter. Must not exceed 1024 characters.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Required. Paths to all fields that the parameter replaces. A field is allowed to appear in at most one parameter's list of field paths. A field path is similar in syntax to a .sparkJob.args
     * 
     */
    @InputImport(name="fields", required=true)
      private final Input<List<String>> fields;

    public Input<List<String>> getFields() {
        return this.fields;
    }

    /**
     * Required. Parameter name. The parameter name is used as the key, and paired with the parameter value, which are passed to the template when the template is instantiated. The name must contain only capital letters (A-Z), numbers (0-9), and underscores (_), and must not start with a number. The maximum length is 40 characters.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Optional. Validation rules to be applied to this parameter's value.
     * 
     */
    @InputImport(name="validation")
      private final @Nullable Input<WorkflowTemplateParameterValidationGetArgs> validation;

    public Input<WorkflowTemplateParameterValidationGetArgs> getValidation() {
        return this.validation == null ? Input.empty() : this.validation;
    }

    public WorkflowTemplateParameterGetArgs(
        @Nullable Input<String> description,
        Input<List<String>> fields,
        Input<String> name,
        @Nullable Input<WorkflowTemplateParameterValidationGetArgs> validation) {
        this.description = description;
        this.fields = Objects.requireNonNull(fields, "expected parameter 'fields' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.validation = validation;
    }

    private WorkflowTemplateParameterGetArgs() {
        this.description = Input.empty();
        this.fields = Input.empty();
        this.name = Input.empty();
        this.validation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<String>> fields;
        private Input<String> name;
        private @Nullable Input<WorkflowTemplateParameterValidationGetArgs> validation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.name = defaults.name;
    	      this.validation = defaults.validation;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder fields(Input<List<String>> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder fields(List<String> fields) {
            this.fields = Input.of(Objects.requireNonNull(fields));
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder validation(@Nullable Input<WorkflowTemplateParameterValidationGetArgs> validation) {
            this.validation = validation;
            return this;
        }

        public Builder validation(@Nullable WorkflowTemplateParameterValidationGetArgs validation) {
            this.validation = Input.ofNullable(validation);
            return this;
        }
        public WorkflowTemplateParameterGetArgs build() {
            return new WorkflowTemplateParameterGetArgs(description, fields, name, validation);
        }
    }
}
