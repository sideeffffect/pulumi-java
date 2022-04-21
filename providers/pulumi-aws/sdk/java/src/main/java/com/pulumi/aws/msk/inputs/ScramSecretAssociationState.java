// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScramSecretAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final ScramSecretAssociationState Empty = new ScramSecretAssociationState();

    /**
     * Amazon Resource Name (ARN) of the MSK cluster.
     * 
     */
    @Import(name="clusterArn")
    private @Nullable Output<String> clusterArn;

    public Optional<Output<String>> clusterArn() {
        return Optional.ofNullable(this.clusterArn);
    }

    /**
     * List of AWS Secrets Manager secret ARNs.
     * 
     */
    @Import(name="secretArnLists")
    private @Nullable Output<List<String>> secretArnLists;

    public Optional<Output<List<String>>> secretArnLists() {
        return Optional.ofNullable(this.secretArnLists);
    }

    private ScramSecretAssociationState() {}

    private ScramSecretAssociationState(ScramSecretAssociationState $) {
        this.clusterArn = $.clusterArn;
        this.secretArnLists = $.secretArnLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScramSecretAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScramSecretAssociationState $;

        public Builder() {
            $ = new ScramSecretAssociationState();
        }

        public Builder(ScramSecretAssociationState defaults) {
            $ = new ScramSecretAssociationState(Objects.requireNonNull(defaults));
        }

        public Builder clusterArn(@Nullable Output<String> clusterArn) {
            $.clusterArn = clusterArn;
            return this;
        }

        public Builder clusterArn(String clusterArn) {
            return clusterArn(Output.of(clusterArn));
        }

        public Builder secretArnLists(@Nullable Output<List<String>> secretArnLists) {
            $.secretArnLists = secretArnLists;
            return this;
        }

        public Builder secretArnLists(List<String> secretArnLists) {
            return secretArnLists(Output.of(secretArnLists));
        }

        public Builder secretArnLists(String... secretArnLists) {
            return secretArnLists(List.of(secretArnLists));
        }

        public ScramSecretAssociationState build() {
            return $;
        }
    }

}
