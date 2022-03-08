// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class WorkflowTemplateParameterValidationRegex {
    /**
     * Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
     */
    private final List<String> regexes;

    @OutputCustomType.Constructor({"regexes"})
    private WorkflowTemplateParameterValidationRegex(List<String> regexes) {
        this.regexes = regexes;
    }

    /**
     * Required. RE2 regular expressions used to validate the parameter's value. The value must match the regex in its entirety (substring matches are not sufficient).
     * 
    */
    public List<String> getRegexes() {
        return this.regexes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateParameterValidationRegex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> regexes;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateParameterValidationRegex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regexes = defaults.regexes;
        }

        public Builder setRegexes(List<String> regexes) {
            this.regexes = Objects.requireNonNull(regexes);
            return this;
        }
        public WorkflowTemplateParameterValidationRegex build() {
            return new WorkflowTemplateParameterValidationRegex(regexes);
        }
    }
}
