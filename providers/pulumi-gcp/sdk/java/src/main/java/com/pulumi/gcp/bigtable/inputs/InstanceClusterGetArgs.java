// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigtable.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceClusterGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceClusterGetArgs Empty = new InstanceClusterGetArgs();

    /**
     * The ID of the Cloud Bigtable cluster.
     * 
     */
    @Import(name="clusterId", required=true)
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }

    /**
     * Describes the Cloud KMS encryption key that will be used to protect the destination Bigtable cluster. The requirements for this key are: 1) The Cloud Bigtable service account associated with the project that contains this cluster must be granted the `cloudkms.cryptoKeyEncrypterDecrypter` role on the CMEK key. 2) Only regional keys can be used and the region of the CMEK key must match the region of the cluster. 3) All clusters within an instance must use the same CMEK key. Values are of the form `projects/{project}/locations/{location}/keyRings/{keyring}/cryptoKeys/{key}`
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    /**
     * The number of nodes in your Cloud Bigtable cluster.
     * Required, with a minimum of `1` for a `PRODUCTION` instance. Must be left unset
     * for a `DEVELOPMENT` instance.
     * 
     */
    @Import(name="numNodes")
    private @Nullable Output<Integer> numNodes;

    public Optional<Output<Integer>> numNodes() {
        return Optional.ofNullable(this.numNodes);
    }

    /**
     * The storage type to use. One of `&#34;SSD&#34;` or
     * `&#34;HDD&#34;`. Defaults to `&#34;SSD&#34;`.
     * 
     */
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * The zone to create the Cloud Bigtable cluster in. If it not
     * specified, the provider zone is used. Each cluster must have a different zone in the same region. Zones that support
     * Bigtable instances are noted on the [Cloud Bigtable locations page](https://cloud.google.com/bigtable/docs/locations).
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private InstanceClusterGetArgs() {}

    private InstanceClusterGetArgs(InstanceClusterGetArgs $) {
        this.clusterId = $.clusterId;
        this.kmsKeyName = $.kmsKeyName;
        this.numNodes = $.numNodes;
        this.storageType = $.storageType;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceClusterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceClusterGetArgs $;

        public Builder() {
            $ = new InstanceClusterGetArgs();
        }

        public Builder(InstanceClusterGetArgs defaults) {
            $ = new InstanceClusterGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterId(Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public Builder numNodes(@Nullable Output<Integer> numNodes) {
            $.numNodes = numNodes;
            return this;
        }

        public Builder numNodes(Integer numNodes) {
            return numNodes(Output.of(numNodes));
        }

        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public InstanceClusterGetArgs build() {
            $.clusterId = Objects.requireNonNull($.clusterId, "expected parameter 'clusterId' to be non-null");
            return $;
        }
    }

}
