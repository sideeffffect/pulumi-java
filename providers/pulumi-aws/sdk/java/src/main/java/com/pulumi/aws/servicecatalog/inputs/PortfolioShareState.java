// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PortfolioShareState extends com.pulumi.resources.ResourceArgs {

    public static final PortfolioShareState Empty = new PortfolioShareState();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
    private @Nullable Output<String> acceptLanguage;

    public Optional<Output<String>> acceptLanguage() {
        return Optional.ofNullable(this.acceptLanguage);
    }

    /**
     * Whether the shared portfolio is imported by the recipient account. If the recipient is organizational, the share is automatically imported, and the field is always set to true.
     * 
     */
    @Import(name="accepted")
    private @Nullable Output<Boolean> accepted;

    public Optional<Output<Boolean>> accepted() {
        return Optional.ofNullable(this.accepted);
    }

    /**
     * Portfolio identifier.
     * 
     */
    @Import(name="portfolioId")
    private @Nullable Output<String> portfolioId;

    public Optional<Output<String>> portfolioId() {
        return Optional.ofNullable(this.portfolioId);
    }

    /**
     * Identifier of the principal with whom you will share the portfolio. Valid values AWS account IDs and ARNs of AWS Organizations and organizational units.
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    /**
     * Whether to enable sharing of `aws.servicecatalog.TagOption` resources when creating the portfolio share.
     * 
     */
    @Import(name="shareTagOptions")
    private @Nullable Output<Boolean> shareTagOptions;

    public Optional<Output<Boolean>> shareTagOptions() {
        return Optional.ofNullable(this.shareTagOptions);
    }

    /**
     * Type of portfolio share. Valid values are `ACCOUNT` (an external account), `ORGANIZATION` (a share to every account in an organization), `ORGANIZATIONAL_UNIT`, `ORGANIZATION_MEMBER_ACCOUNT` (a share to an account in an organization).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    /**
     * Whether to wait (up to the timeout) for the share to be accepted. Organizational shares are automatically accepted.
     * 
     */
    @Import(name="waitForAcceptance")
    private @Nullable Output<Boolean> waitForAcceptance;

    public Optional<Output<Boolean>> waitForAcceptance() {
        return Optional.ofNullable(this.waitForAcceptance);
    }

    private PortfolioShareState() {}

    private PortfolioShareState(PortfolioShareState $) {
        this.acceptLanguage = $.acceptLanguage;
        this.accepted = $.accepted;
        this.portfolioId = $.portfolioId;
        this.principalId = $.principalId;
        this.shareTagOptions = $.shareTagOptions;
        this.type = $.type;
        this.waitForAcceptance = $.waitForAcceptance;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PortfolioShareState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PortfolioShareState $;

        public Builder() {
            $ = new PortfolioShareState();
        }

        public Builder(PortfolioShareState defaults) {
            $ = new PortfolioShareState(Objects.requireNonNull(defaults));
        }

        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            $.acceptLanguage = acceptLanguage;
            return this;
        }

        public Builder acceptLanguage(String acceptLanguage) {
            return acceptLanguage(Output.of(acceptLanguage));
        }

        public Builder accepted(@Nullable Output<Boolean> accepted) {
            $.accepted = accepted;
            return this;
        }

        public Builder accepted(Boolean accepted) {
            return accepted(Output.of(accepted));
        }

        public Builder portfolioId(@Nullable Output<String> portfolioId) {
            $.portfolioId = portfolioId;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            return portfolioId(Output.of(portfolioId));
        }

        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public Builder shareTagOptions(@Nullable Output<Boolean> shareTagOptions) {
            $.shareTagOptions = shareTagOptions;
            return this;
        }

        public Builder shareTagOptions(Boolean shareTagOptions) {
            return shareTagOptions(Output.of(shareTagOptions));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public Builder waitForAcceptance(@Nullable Output<Boolean> waitForAcceptance) {
            $.waitForAcceptance = waitForAcceptance;
            return this;
        }

        public Builder waitForAcceptance(Boolean waitForAcceptance) {
            return waitForAcceptance(Output.of(waitForAcceptance));
        }

        public PortfolioShareState build() {
            return $;
        }
    }

}
