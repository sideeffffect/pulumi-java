// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Template {
    /**
     * The HTML body of the email.
     * 
     */
    private final @Nullable String htmlPart;
    /**
     * The subject line of the email.
     * 
     */
    private final String subjectPart;
    /**
     * The name of the template.
     * 
     */
    private final @Nullable String templateName;
    /**
     * The email body that is visible to recipients whose email clients do not display HTML content.
     * 
     */
    private final @Nullable String textPart;

    @OutputCustomType.Constructor
    private Template(
        @OutputCustomType.Parameter("htmlPart") @Nullable String htmlPart,
        @OutputCustomType.Parameter("subjectPart") String subjectPart,
        @OutputCustomType.Parameter("templateName") @Nullable String templateName,
        @OutputCustomType.Parameter("textPart") @Nullable String textPart) {
        this.htmlPart = htmlPart;
        this.subjectPart = subjectPart;
        this.templateName = templateName;
        this.textPart = textPart;
    }

    /**
     * The HTML body of the email.
     * 
    */
    public Optional<String> getHtmlPart() {
        return Optional.ofNullable(this.htmlPart);
    }
    /**
     * The subject line of the email.
     * 
    */
    public String getSubjectPart() {
        return this.subjectPart;
    }
    /**
     * The name of the template.
     * 
    */
    public Optional<String> getTemplateName() {
        return Optional.ofNullable(this.templateName);
    }
    /**
     * The email body that is visible to recipients whose email clients do not display HTML content.
     * 
    */
    public Optional<String> getTextPart() {
        return Optional.ofNullable(this.textPart);
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
        }
        public Template build() {
            return new Template(htmlPart, subjectPart, templateName, textPart);
        }
    }
}
