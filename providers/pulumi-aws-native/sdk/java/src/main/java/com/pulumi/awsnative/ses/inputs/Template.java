// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ses.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The content of the email, composed of a subject line, an HTML part, and a text-only part
 * 
 */
public final class Template extends com.pulumi.resources.InvokeArgs {

    public static final Template Empty = new Template();

    /**
     * The HTML body of the email.
     * 
     */
    @Import(name="htmlPart")
      private final @Nullable String htmlPart;

    public Optional<String> htmlPart() {
        return this.htmlPart == null ? Optional.empty() : Optional.ofNullable(this.htmlPart);
    }

    /**
     * The subject line of the email.
     * 
     */
    @Import(name="subjectPart", required=true)
      private final String subjectPart;

    public String subjectPart() {
        return this.subjectPart;
    }

    /**
     * The name of the template.
     * 
     */
    @Import(name="templateName")
      private final @Nullable String templateName;

    public Optional<String> templateName() {
        return this.templateName == null ? Optional.empty() : Optional.ofNullable(this.templateName);
    }

    /**
     * The email body that is visible to recipients whose email clients do not display HTML content.
     * 
     */
    @Import(name="textPart")
      private final @Nullable String textPart;

    public Optional<String> textPart() {
        return this.textPart == null ? Optional.empty() : Optional.ofNullable(this.textPart);
    }

    public Template(
        @Nullable String htmlPart,
        String subjectPart,
        @Nullable String templateName,
        @Nullable String textPart) {
        this.htmlPart = htmlPart;
        this.subjectPart = Objects.requireNonNull(subjectPart, "expected parameter 'subjectPart' to be non-null");
        this.templateName = templateName;
        this.textPart = textPart;
    }

    private Template() {
        this.htmlPart = null;
        this.subjectPart = null;
        this.templateName = null;
        this.textPart = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Template defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String htmlPart;
        private String subjectPart;
        private @Nullable String templateName;
        private @Nullable String textPart;

        public Builder() {
    	      // Empty
        }

        public Builder(Template defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.htmlPart = defaults.htmlPart;
    	      this.subjectPart = defaults.subjectPart;
    	      this.templateName = defaults.templateName;
    	      this.textPart = defaults.textPart;
        }

        public Builder htmlPart(@Nullable String htmlPart) {
            this.htmlPart = htmlPart;
            return this;
        }
        public Builder subjectPart(String subjectPart) {
            this.subjectPart = Objects.requireNonNull(subjectPart);
            return this;
        }
        public Builder templateName(@Nullable String templateName) {
            this.templateName = templateName;
            return this;
        }
        public Builder textPart(@Nullable String textPart) {
            this.textPart = textPart;
            return this;
        }        public Template build() {
            return new Template(htmlPart, subjectPart, templateName, textPart);
        }
    }
}
