// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TemplateState extends io.pulumi.resources.ResourceArgs {

    public static final TemplateState Empty = new TemplateState();

    /**
     * The ARN of the SES template
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @Import(name="html")
      private final @Nullable Output<String> html;

    public Output<String> html() {
        return this.html == null ? Codegen.empty() : this.html;
    }

    /**
     * The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The subject line of the email.
     * 
     */
    @Import(name="subject")
      private final @Nullable Output<String> subject;

    public Output<String> subject() {
        return this.subject == null ? Codegen.empty() : this.subject;
    }

    /**
     * The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
     * 
     */
    @Import(name="text")
      private final @Nullable Output<String> text;

    public Output<String> text() {
        return this.text == null ? Codegen.empty() : this.text;
    }

    public TemplateState(
        @Nullable Output<String> arn,
        @Nullable Output<String> html,
        @Nullable Output<String> name,
        @Nullable Output<String> subject,
        @Nullable Output<String> text) {
        this.arn = arn;
        this.html = html;
        this.name = name;
        this.subject = subject;
        this.text = text;
    }

    private TemplateState() {
        this.arn = Codegen.empty();
        this.html = Codegen.empty();
        this.name = Codegen.empty();
        this.subject = Codegen.empty();
        this.text = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> html;
        private @Nullable Output<String> name;
        private @Nullable Output<String> subject;
        private @Nullable Output<String> text;

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

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder html(@Nullable Output<String> html) {
            this.html = html;
            return this;
        }
        public Builder html(@Nullable String html) {
            this.html = Codegen.ofNullable(html);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder subject(@Nullable Output<String> subject) {
            this.subject = subject;
            return this;
        }
        public Builder subject(@Nullable String subject) {
            this.subject = Codegen.ofNullable(subject);
            return this;
        }
        public Builder text(@Nullable Output<String> text) {
            this.text = text;
            return this;
        }
        public Builder text(@Nullable String text) {
            this.text = Codegen.ofNullable(text);
            return this;
        }        public TemplateState build() {
            return new TemplateState(arn, html, name, subject, text);
        }
    }
}
