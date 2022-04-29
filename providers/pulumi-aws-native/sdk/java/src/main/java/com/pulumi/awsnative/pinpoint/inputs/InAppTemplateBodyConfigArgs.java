// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.pinpoint.inputs;

import com.pulumi.awsnative.pinpoint.enums.InAppTemplateAlignment;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InAppTemplateBodyConfigArgs extends ResourceArgs {

    public static final InAppTemplateBodyConfigArgs Empty = new InAppTemplateBodyConfigArgs();

    @Import(name="alignment")
    private @Nullable Output<InAppTemplateAlignment> alignment;

    public Optional<Output<InAppTemplateAlignment>> alignment() {
        return Optional.ofNullable(this.alignment);
    }

    @Import(name="body")
    private @Nullable Output<String> body;

    public Optional<Output<String>> body() {
        return Optional.ofNullable(this.body);
    }

    @Import(name="textColor")
    private @Nullable Output<String> textColor;

    public Optional<Output<String>> textColor() {
        return Optional.ofNullable(this.textColor);
    }

    private InAppTemplateBodyConfigArgs() {}

    private InAppTemplateBodyConfigArgs(InAppTemplateBodyConfigArgs $) {
        this.alignment = $.alignment;
        this.body = $.body;
        this.textColor = $.textColor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InAppTemplateBodyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InAppTemplateBodyConfigArgs $;

        public Builder() {
            $ = new InAppTemplateBodyConfigArgs();
        }

        public Builder(InAppTemplateBodyConfigArgs defaults) {
            $ = new InAppTemplateBodyConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder alignment(@Nullable Output<InAppTemplateAlignment> alignment) {
            $.alignment = alignment;
            return this;
        }

        public Builder alignment(InAppTemplateAlignment alignment) {
            return alignment(Output.of(alignment));
        }

        public Builder body(@Nullable Output<String> body) {
            $.body = body;
            return this;
        }

        public Builder body(String body) {
            return body(Output.of(body));
        }

        public Builder textColor(@Nullable Output<String> textColor) {
            $.textColor = textColor;
            return this;
        }

        public Builder textColor(String textColor) {
            return textColor(Output.of(textColor));
        }

        public InAppTemplateBodyConfigArgs build() {
            return $;
        }
    }

}
