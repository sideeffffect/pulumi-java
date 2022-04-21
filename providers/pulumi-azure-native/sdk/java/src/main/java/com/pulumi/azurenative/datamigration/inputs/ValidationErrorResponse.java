// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Description about the errors happen while performing migration validation
 * 
 */
public final class ValidationErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final ValidationErrorResponse Empty = new ValidationErrorResponse();

    /**
     * Severity of the error
     * 
     */
    @Import(name="severity", required=true)
    private String severity;

    public String severity() {
        return this.severity;
    }

    /**
     * Error Text
     * 
     */
    @Import(name="text", required=true)
    private String text;

    public String text() {
        return this.text;
    }

    private ValidationErrorResponse() {}

    private ValidationErrorResponse(ValidationErrorResponse $) {
        this.severity = $.severity;
        this.text = $.text;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ValidationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ValidationErrorResponse $;

        public Builder() {
            $ = new ValidationErrorResponse();
        }

        public Builder(ValidationErrorResponse defaults) {
            $ = new ValidationErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder severity(String severity) {
            $.severity = severity;
            return this;
        }

        public Builder text(String text) {
            $.text = text;
            return this;
        }

        public ValidationErrorResponse build() {
            $.severity = Objects.requireNonNull($.severity, "expected parameter 'severity' to be non-null");
            $.text = Objects.requireNonNull($.text, "expected parameter 'text' to be non-null");
            return $;
        }
    }

}
