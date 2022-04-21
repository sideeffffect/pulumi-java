// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardsControlState extends com.pulumi.resources.ResourceArgs {

    public static final StandardsControlState Empty = new StandardsControlState();

    /**
     * The identifier of the security standard control.
     * 
     */
    @Import(name="controlId")
    private @Nullable Output<String> controlId;

    public Optional<Output<String>> controlId() {
        return Optional.ofNullable(this.controlId);
    }

    /**
     * The control status could be `ENABLED` or `DISABLED`. You have to specify `disabled_reason` argument for `DISABLED` control status.
     * 
     */
    @Import(name="controlStatus")
    private @Nullable Output<String> controlStatus;

    public Optional<Output<String>> controlStatus() {
        return Optional.ofNullable(this.controlStatus);
    }

    /**
     * The date and time that the status of the security standard control was most recently updated.
     * 
     */
    @Import(name="controlStatusUpdatedAt")
    private @Nullable Output<String> controlStatusUpdatedAt;

    public Optional<Output<String>> controlStatusUpdatedAt() {
        return Optional.ofNullable(this.controlStatusUpdatedAt);
    }

    /**
     * The standard control longer description. Provides information about what the control is checking for.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A description of the reason why you are disabling a security standard control. If you specify this attribute, `control_status` will be set to `DISABLED` automatically.
     * 
     */
    @Import(name="disabledReason")
    private @Nullable Output<String> disabledReason;

    public Optional<Output<String>> disabledReason() {
        return Optional.ofNullable(this.disabledReason);
    }

    /**
     * The list of requirements that are related to this control.
     * 
     */
    @Import(name="relatedRequirements")
    private @Nullable Output<List<String>> relatedRequirements;

    public Optional<Output<List<String>>> relatedRequirements() {
        return Optional.ofNullable(this.relatedRequirements);
    }

    /**
     * A link to remediation information for the control in the Security Hub user documentation.
     * 
     */
    @Import(name="remediationUrl")
    private @Nullable Output<String> remediationUrl;

    public Optional<Output<String>> remediationUrl() {
        return Optional.ofNullable(this.remediationUrl);
    }

    /**
     * The severity of findings generated from this security standard control.
     * 
     */
    @Import(name="severityRating")
    private @Nullable Output<String> severityRating;

    public Optional<Output<String>> severityRating() {
        return Optional.ofNullable(this.severityRating);
    }

    /**
     * The standards control ARN.
     * 
     */
    @Import(name="standardsControlArn")
    private @Nullable Output<String> standardsControlArn;

    public Optional<Output<String>> standardsControlArn() {
        return Optional.ofNullable(this.standardsControlArn);
    }

    /**
     * The standard control title.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private StandardsControlState() {}

    private StandardsControlState(StandardsControlState $) {
        this.controlId = $.controlId;
        this.controlStatus = $.controlStatus;
        this.controlStatusUpdatedAt = $.controlStatusUpdatedAt;
        this.description = $.description;
        this.disabledReason = $.disabledReason;
        this.relatedRequirements = $.relatedRequirements;
        this.remediationUrl = $.remediationUrl;
        this.severityRating = $.severityRating;
        this.standardsControlArn = $.standardsControlArn;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardsControlState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardsControlState $;

        public Builder() {
            $ = new StandardsControlState();
        }

        public Builder(StandardsControlState defaults) {
            $ = new StandardsControlState(Objects.requireNonNull(defaults));
        }

        public Builder controlId(@Nullable Output<String> controlId) {
            $.controlId = controlId;
            return this;
        }

        public Builder controlId(String controlId) {
            return controlId(Output.of(controlId));
        }

        public Builder controlStatus(@Nullable Output<String> controlStatus) {
            $.controlStatus = controlStatus;
            return this;
        }

        public Builder controlStatus(String controlStatus) {
            return controlStatus(Output.of(controlStatus));
        }

        public Builder controlStatusUpdatedAt(@Nullable Output<String> controlStatusUpdatedAt) {
            $.controlStatusUpdatedAt = controlStatusUpdatedAt;
            return this;
        }

        public Builder controlStatusUpdatedAt(String controlStatusUpdatedAt) {
            return controlStatusUpdatedAt(Output.of(controlStatusUpdatedAt));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder disabledReason(@Nullable Output<String> disabledReason) {
            $.disabledReason = disabledReason;
            return this;
        }

        public Builder disabledReason(String disabledReason) {
            return disabledReason(Output.of(disabledReason));
        }

        public Builder relatedRequirements(@Nullable Output<List<String>> relatedRequirements) {
            $.relatedRequirements = relatedRequirements;
            return this;
        }

        public Builder relatedRequirements(List<String> relatedRequirements) {
            return relatedRequirements(Output.of(relatedRequirements));
        }

        public Builder relatedRequirements(String... relatedRequirements) {
            return relatedRequirements(List.of(relatedRequirements));
        }

        public Builder remediationUrl(@Nullable Output<String> remediationUrl) {
            $.remediationUrl = remediationUrl;
            return this;
        }

        public Builder remediationUrl(String remediationUrl) {
            return remediationUrl(Output.of(remediationUrl));
        }

        public Builder severityRating(@Nullable Output<String> severityRating) {
            $.severityRating = severityRating;
            return this;
        }

        public Builder severityRating(String severityRating) {
            return severityRating(Output.of(severityRating));
        }

        public Builder standardsControlArn(@Nullable Output<String> standardsControlArn) {
            $.standardsControlArn = standardsControlArn;
            return this;
        }

        public Builder standardsControlArn(String standardsControlArn) {
            return standardsControlArn(Output.of(standardsControlArn));
        }

        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public StandardsControlState build() {
            return $;
        }
    }

}
