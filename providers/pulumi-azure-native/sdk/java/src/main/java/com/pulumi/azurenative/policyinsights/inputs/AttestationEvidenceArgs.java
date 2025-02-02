// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A piece of evidence supporting the compliance state set in the attestation.
 * 
 */
public final class AttestationEvidenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttestationEvidenceArgs Empty = new AttestationEvidenceArgs();

    /**
     * The description for this piece of evidence.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description for this piece of evidence.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The URI location of the evidence.
     * 
     */
    @Import(name="sourceUri")
    private @Nullable Output<String> sourceUri;

    /**
     * @return The URI location of the evidence.
     * 
     */
    public Optional<Output<String>> sourceUri() {
        return Optional.ofNullable(this.sourceUri);
    }

    private AttestationEvidenceArgs() {}

    private AttestationEvidenceArgs(AttestationEvidenceArgs $) {
        this.description = $.description;
        this.sourceUri = $.sourceUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttestationEvidenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttestationEvidenceArgs $;

        public Builder() {
            $ = new AttestationEvidenceArgs();
        }

        public Builder(AttestationEvidenceArgs defaults) {
            $ = new AttestationEvidenceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description for this piece of evidence.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description for this piece of evidence.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param sourceUri The URI location of the evidence.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(@Nullable Output<String> sourceUri) {
            $.sourceUri = sourceUri;
            return this;
        }

        /**
         * @param sourceUri The URI location of the evidence.
         * 
         * @return builder
         * 
         */
        public Builder sourceUri(String sourceUri) {
            return sourceUri(Output.of(sourceUri));
        }

        public AttestationEvidenceArgs build() {
            return $;
        }
    }

}
