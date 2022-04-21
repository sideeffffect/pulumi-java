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
    private @Nullable String htmlPart;

    public Optional<String> htmlPart() {
        return Optional.ofNullable(this.htmlPart);
    }

    /**
     * The subject line of the email.
     * 
     */
    @Import(name="subjectPart", required=true)
    private String subjectPart;

    public String subjectPart() {
        return this.subjectPart;
    }

    /**
     * The name of the template.
     * 
     */
    @Import(name="templateName")
    private @Nullable String templateName;

    public Optional<String> templateName() {
        return Optional.ofNullable(this.templateName);
    }

    /**
     * The email body that is visible to recipients whose email clients do not display HTML content.
     * 
     */
    @Import(name="textPart")
    private @Nullable String textPart;

    public Optional<String> textPart() {
        return Optional.ofNullable(this.textPart);
    }

    private Template() {}

    private Template(Template $) {
        this.htmlPart = $.htmlPart;
        this.subjectPart = $.subjectPart;
        this.templateName = $.templateName;
        this.textPart = $.textPart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Template defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Template $;

        public Builder() {
            $ = new Template();
        }

        public Builder(Template defaults) {
            $ = new Template(Objects.requireNonNull(defaults));
        }

        public Builder htmlPart(@Nullable String htmlPart) {
            $.htmlPart = htmlPart;
            return this;
        }

        public Builder subjectPart(String subjectPart) {
            $.subjectPart = subjectPart;
            return this;
        }

        public Builder templateName(@Nullable String templateName) {
            $.templateName = templateName;
            return this;
        }

        public Builder textPart(@Nullable String textPart) {
            $.textPart = textPart;
            return this;
        }

        public Template build() {
            $.subjectPart = Objects.requireNonNull($.subjectPart, "expected parameter 'subjectPart' to be non-null");
            return $;
        }
    }

}
