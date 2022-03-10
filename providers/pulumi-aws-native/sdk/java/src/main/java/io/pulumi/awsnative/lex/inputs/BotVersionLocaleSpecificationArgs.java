// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotVersionLocaleDetailsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BotVersionLocaleSpecificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotVersionLocaleSpecificationArgs Empty = new BotVersionLocaleSpecificationArgs();

    @InputImport(name="botVersionLocaleDetails", required=true)
      private final Input<BotVersionLocaleDetailsArgs> botVersionLocaleDetails;

    public Input<BotVersionLocaleDetailsArgs> getBotVersionLocaleDetails() {
        return this.botVersionLocaleDetails;
    }

    @InputImport(name="localeId", required=true)
      private final Input<String> localeId;

    public Input<String> getLocaleId() {
        return this.localeId;
    }

    public BotVersionLocaleSpecificationArgs(
        Input<BotVersionLocaleDetailsArgs> botVersionLocaleDetails,
        Input<String> localeId) {
        this.botVersionLocaleDetails = Objects.requireNonNull(botVersionLocaleDetails, "expected parameter 'botVersionLocaleDetails' to be non-null");
        this.localeId = Objects.requireNonNull(localeId, "expected parameter 'localeId' to be non-null");
    }

    private BotVersionLocaleSpecificationArgs() {
        this.botVersionLocaleDetails = Input.empty();
        this.localeId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotVersionLocaleSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BotVersionLocaleDetailsArgs> botVersionLocaleDetails;
        private Input<String> localeId;

        public Builder() {
    	      // Empty
        }

        public Builder(BotVersionLocaleSpecificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botVersionLocaleDetails = defaults.botVersionLocaleDetails;
    	      this.localeId = defaults.localeId;
        }

        public Builder botVersionLocaleDetails(Input<BotVersionLocaleDetailsArgs> botVersionLocaleDetails) {
            this.botVersionLocaleDetails = Objects.requireNonNull(botVersionLocaleDetails);
            return this;
        }

        public Builder botVersionLocaleDetails(BotVersionLocaleDetailsArgs botVersionLocaleDetails) {
            this.botVersionLocaleDetails = Input.of(Objects.requireNonNull(botVersionLocaleDetails));
            return this;
        }

        public Builder localeId(Input<String> localeId) {
            this.localeId = Objects.requireNonNull(localeId);
            return this;
        }

        public Builder localeId(String localeId) {
            this.localeId = Input.of(Objects.requireNonNull(localeId));
            return this;
        }
        public BotVersionLocaleSpecificationArgs build() {
            return new BotVersionLocaleSpecificationArgs(botVersionLocaleDetails, localeId);
        }
    }
}
