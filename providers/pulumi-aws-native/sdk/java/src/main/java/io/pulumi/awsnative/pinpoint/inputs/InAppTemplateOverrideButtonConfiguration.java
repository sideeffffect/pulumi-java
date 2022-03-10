// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.pinpoint.inputs;

import io.pulumi.awsnative.pinpoint.enums.InAppTemplateButtonAction;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InAppTemplateOverrideButtonConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final InAppTemplateOverrideButtonConfiguration Empty = new InAppTemplateOverrideButtonConfiguration();

    @InputImport(name="buttonAction")
      private final @Nullable InAppTemplateButtonAction buttonAction;

    public Optional<InAppTemplateButtonAction> getButtonAction() {
        return this.buttonAction == null ? Optional.empty() : Optional.ofNullable(this.buttonAction);
    }

    @InputImport(name="link")
      private final @Nullable String link;

    public Optional<String> getLink() {
        return this.link == null ? Optional.empty() : Optional.ofNullable(this.link);
    }

    public InAppTemplateOverrideButtonConfiguration(
        @Nullable InAppTemplateButtonAction buttonAction,
        @Nullable String link) {
        this.buttonAction = buttonAction;
        this.link = link;
    }

    private InAppTemplateOverrideButtonConfiguration() {
        this.buttonAction = null;
        this.link = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InAppTemplateOverrideButtonConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InAppTemplateButtonAction buttonAction;
        private @Nullable String link;

        public Builder() {
    	      // Empty
        }

        public Builder(InAppTemplateOverrideButtonConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buttonAction = defaults.buttonAction;
    	      this.link = defaults.link;
        }

        public Builder buttonAction(@Nullable InAppTemplateButtonAction buttonAction) {
            this.buttonAction = buttonAction;
            return this;
        }

        public Builder link(@Nullable String link) {
            this.link = link;
            return this;
        }
        public InAppTemplateOverrideButtonConfiguration build() {
            return new InAppTemplateOverrideButtonConfiguration(buttonAction, link);
        }
    }
}
