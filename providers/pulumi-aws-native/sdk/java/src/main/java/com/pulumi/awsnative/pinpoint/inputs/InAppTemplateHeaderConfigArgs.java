// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.pinpoint.inputs;

import com.pulumi.awsnative.pinpoint.enums.InAppTemplateAlignment;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InAppTemplateHeaderConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InAppTemplateHeaderConfigArgs Empty = new InAppTemplateHeaderConfigArgs();

    @Import(name="alignment")
    private @Nullable Output<InAppTemplateAlignment> alignment;

    public Optional<Output<InAppTemplateAlignment>> alignment() {
        return Optional.ofNullable(this.alignment);
    }

    @Import(name="header")
    private @Nullable Output<String> header;

    public Optional<Output<String>> header() {
        return Optional.ofNullable(this.header);
    }

    @Import(name="textColor")
    private @Nullable Output<String> textColor;

    public Optional<Output<String>> textColor() {
        return Optional.ofNullable(this.textColor);
    }

    private InAppTemplateHeaderConfigArgs() {}

    private InAppTemplateHeaderConfigArgs(InAppTemplateHeaderConfigArgs $) {
        this.alignment = $.alignment;
        this.header = $.header;
        this.textColor = $.textColor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InAppTemplateHeaderConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InAppTemplateHeaderConfigArgs $;

        public Builder() {
            $ = new InAppTemplateHeaderConfigArgs();
        }

        public Builder(InAppTemplateHeaderConfigArgs defaults) {
            $ = new InAppTemplateHeaderConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder alignment(@Nullable Output<InAppTemplateAlignment> alignment) {
            $.alignment = alignment;
            return this;
        }

        public Builder alignment(InAppTemplateAlignment alignment) {
            return alignment(Output.of(alignment));
        }

        public Builder header(@Nullable Output<String> header) {
            $.header = header;
            return this;
        }

        public Builder header(String header) {
            return header(Output.of(header));
        }

        public Builder textColor(@Nullable Output<String> textColor) {
            $.textColor = textColor;
            return this;
        }

        public Builder textColor(String textColor) {
            return textColor(Output.of(textColor));
        }

        public InAppTemplateHeaderConfigArgs build() {
            return $;
        }
    }

}
