// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ses;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final TemplateArgs Empty = new TemplateArgs();

    @InputImport(name="template")
      private final @Nullable Input<io.pulumi.awsnative.ses.inputs.TemplateArgs> template;

    public Input<io.pulumi.awsnative.ses.inputs.TemplateArgs> getTemplate() {
        return this.template == null ? Input.empty() : this.template;
    }

    public TemplateArgs(@Nullable Input<io.pulumi.awsnative.ses.inputs.TemplateArgs> template) {
        this.template = template;
    }

    private TemplateArgs() {
        this.template = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<io.pulumi.awsnative.ses.inputs.TemplateArgs> template;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.template = defaults.template;
        }

        public Builder template(@Nullable Input<io.pulumi.awsnative.ses.inputs.TemplateArgs> template) {
            this.template = template;
            return this;
        }

        public Builder template(@Nullable io.pulumi.awsnative.ses.inputs.TemplateArgs template) {
            this.template = Input.ofNullable(template);
            return this;
        }
        public TemplateArgs build() {
            return new TemplateArgs(template);
        }
    }
}
