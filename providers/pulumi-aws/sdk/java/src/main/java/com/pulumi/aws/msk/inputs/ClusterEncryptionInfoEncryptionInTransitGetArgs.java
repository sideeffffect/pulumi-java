// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterEncryptionInfoEncryptionInTransitGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionInfoEncryptionInTransitGetArgs Empty = new ClusterEncryptionInfoEncryptionInTransitGetArgs();

    /**
     * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS`.
     * 
     */
    @Import(name="clientBroker")
    private @Nullable Output<String> clientBroker;

    public Optional<Output<String>> clientBroker() {
        return Optional.ofNullable(this.clientBroker);
    }

    /**
     * Whether data communication among broker nodes is encrypted. Default value: `true`.
     * 
     */
    @Import(name="inCluster")
    private @Nullable Output<Boolean> inCluster;

    public Optional<Output<Boolean>> inCluster() {
        return Optional.ofNullable(this.inCluster);
    }

    private ClusterEncryptionInfoEncryptionInTransitGetArgs() {}

    private ClusterEncryptionInfoEncryptionInTransitGetArgs(ClusterEncryptionInfoEncryptionInTransitGetArgs $) {
        this.clientBroker = $.clientBroker;
        this.inCluster = $.inCluster;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterEncryptionInfoEncryptionInTransitGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterEncryptionInfoEncryptionInTransitGetArgs $;

        public Builder() {
            $ = new ClusterEncryptionInfoEncryptionInTransitGetArgs();
        }

        public Builder(ClusterEncryptionInfoEncryptionInTransitGetArgs defaults) {
            $ = new ClusterEncryptionInfoEncryptionInTransitGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientBroker(@Nullable Output<String> clientBroker) {
            $.clientBroker = clientBroker;
            return this;
        }

        public Builder clientBroker(String clientBroker) {
            return clientBroker(Output.of(clientBroker));
        }

        public Builder inCluster(@Nullable Output<Boolean> inCluster) {
            $.inCluster = inCluster;
            return this;
        }

        public Builder inCluster(Boolean inCluster) {
            return inCluster(Output.of(inCluster));
        }

        public ClusterEncryptionInfoEncryptionInTransitGetArgs build() {
            return $;
        }
    }

}
