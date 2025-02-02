// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Descriptor for what needs to be reviewed
 * 
 */
public final class AccessReviewReviewerArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessReviewReviewerArgs Empty = new AccessReviewReviewerArgs();

    /**
     * The id of the reviewer(user/servicePrincipal)
     * 
     */
    @Import(name="principalId")
    private @Nullable Output<String> principalId;

    /**
     * @return The id of the reviewer(user/servicePrincipal)
     * 
     */
    public Optional<Output<String>> principalId() {
        return Optional.ofNullable(this.principalId);
    }

    private AccessReviewReviewerArgs() {}

    private AccessReviewReviewerArgs(AccessReviewReviewerArgs $) {
        this.principalId = $.principalId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessReviewReviewerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessReviewReviewerArgs $;

        public Builder() {
            $ = new AccessReviewReviewerArgs();
        }

        public Builder(AccessReviewReviewerArgs defaults) {
            $ = new AccessReviewReviewerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param principalId The id of the reviewer(user/servicePrincipal)
         * 
         * @return builder
         * 
         */
        public Builder principalId(@Nullable Output<String> principalId) {
            $.principalId = principalId;
            return this;
        }

        /**
         * @param principalId The id of the reviewer(user/servicePrincipal)
         * 
         * @return builder
         * 
         */
        public Builder principalId(String principalId) {
            return principalId(Output.of(principalId));
        }

        public AccessReviewReviewerArgs build() {
            return $;
        }
    }

}
