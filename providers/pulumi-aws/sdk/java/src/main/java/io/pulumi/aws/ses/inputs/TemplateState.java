// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TemplateState extends io.pulumi.resources.ResourceArgs {

    public static final TemplateState Empty = new TemplateState();

    /**
     * The ARN of the SES template
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @InputImport(name="html")
      private final @Nullable Input<String> html;

    public Input<String> getHtml() {
        return this.html == null ? Input.empty() : this.html;
    }

    /**
     * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The subject line of the email.
     * 
     */
    @InputImport(name="subject")
      private final @Nullable Input<String> subject;

    public Input<String> getSubject() {
        return this.subject == null ? Input.empty() : this.subject;
    }

    /**
     * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @InputImport(name="text")
      private final @Nullable Input<String> text;

    public Input<String> getText() {
        return this.text == null ? Input.empty() : this.text;
    }

    public TemplateState(
        @Nullable Input<String> arn,
        @Nullable Input<String> html,
        @Nullable Input<String> name,
        @Nullable Input<String> subject,
        @Nullable Input<String> text) {
        this.arn = arn;
        this.html = html;
        this.name = name;
        this.subject = subject;
        this.text = text;
    }

    private TemplateState() {
        this.arn = Input.empty();
        this.html = Input.empty();
        this.name = Input.empty();
        this.subject = Input.empty();
        this.text = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> html;
        private @Nullable Input<String> name;
        private @Nullable Input<String> subject;
        private @Nullable Input<String> text;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.html = defaults.html;
    	      this.name = defaults.name;
    	      this.subject = defaults.subject;
    	      this.text = defaults.text;
        }

        public Builder arn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder html(@Nullable Input<String> html) {
            this.html = html;
            return this;
        }

        public Builder html(@Nullable String html) {
            this.html = Input.ofNullable(html);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder subject(@Nullable Input<String> subject) {
            this.subject = subject;
            return this;
        }

        public Builder subject(@Nullable String subject) {
            this.subject = Input.ofNullable(subject);
            return this;
        }

        public Builder text(@Nullable Input<String> text) {
            this.text = text;
            return this;
        }

        public Builder text(@Nullable String text) {
            this.text = Input.ofNullable(text);
            return this;
        }
        public TemplateState build() {
            return new TemplateState(arn, html, name, subject, text);
        }
    }
}
