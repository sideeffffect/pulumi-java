// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The state of the Kubernetes cluster.
 * 
 */
public final class KubernetesClusterStateResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubernetesClusterStateResponse Empty = new KubernetesClusterStateResponse();

    /**
     * The version of Agones currently installed in the registered Kubernetes cluster.
     * 
     */
    @Import(name="agonesVersionInstalled", required=true)
      private final String agonesVersionInstalled;

    public String agonesVersionInstalled() {
        return this.agonesVersionInstalled;
    }

    /**
     * The version of Agones that is targeted to be installed in the cluster.
     * 
     */
    @Import(name="agonesVersionTargeted", required=true)
      private final String agonesVersionTargeted;

    public String agonesVersionTargeted() {
        return this.agonesVersionTargeted;
    }

    /**
     * The state for the installed versions of Agones/Kubernetes.
     * 
     */
    @Import(name="installationState", required=true)
      private final String installationState;

    public String installationState() {
        return this.installationState;
    }

    /**
     * The version of Kubernetes that is currently used in the registered Kubernetes cluster (as detected by the Cloud Game Servers service).
     * 
     */
    @Import(name="kubernetesVersionInstalled", required=true)
      private final String kubernetesVersionInstalled;

    public String kubernetesVersionInstalled() {
        return this.kubernetesVersionInstalled;
    }

    /**
     * The cloud provider type reported by the first node's providerID in the list of nodes on the Kubernetes endpoint. On Kubernetes platforms that support zero-node clusters (like GKE-on-GCP), the provider type will be empty.
     * 
     */
    @Import(name="provider", required=true)
      private final String provider;

    public String provider() {
        return this.provider;
    }

    /**
     * The detailed error message for the installed versions of Agones/Kubernetes.
     * 
     */
    @Import(name="versionInstalledErrorMessage", required=true)
      private final String versionInstalledErrorMessage;

    public String versionInstalledErrorMessage() {
        return this.versionInstalledErrorMessage;
    }

    public KubernetesClusterStateResponse(
        String agonesVersionInstalled,
        String agonesVersionTargeted,
        String installationState,
        String kubernetesVersionInstalled,
        String provider,
        String versionInstalledErrorMessage) {
        this.agonesVersionInstalled = Objects.requireNonNull(agonesVersionInstalled, "expected parameter 'agonesVersionInstalled' to be non-null");
        this.agonesVersionTargeted = Objects.requireNonNull(agonesVersionTargeted, "expected parameter 'agonesVersionTargeted' to be non-null");
        this.installationState = Objects.requireNonNull(installationState, "expected parameter 'installationState' to be non-null");
        this.kubernetesVersionInstalled = Objects.requireNonNull(kubernetesVersionInstalled, "expected parameter 'kubernetesVersionInstalled' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.versionInstalledErrorMessage = Objects.requireNonNull(versionInstalledErrorMessage, "expected parameter 'versionInstalledErrorMessage' to be non-null");
    }

    private KubernetesClusterStateResponse() {
        this.agonesVersionInstalled = null;
        this.agonesVersionTargeted = null;
        this.installationState = null;
        this.kubernetesVersionInstalled = null;
        this.provider = null;
        this.versionInstalledErrorMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterStateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String agonesVersionInstalled;
        private String agonesVersionTargeted;
        private String installationState;
        private String kubernetesVersionInstalled;
        private String provider;
        private String versionInstalledErrorMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterStateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agonesVersionInstalled = defaults.agonesVersionInstalled;
    	      this.agonesVersionTargeted = defaults.agonesVersionTargeted;
    	      this.installationState = defaults.installationState;
    	      this.kubernetesVersionInstalled = defaults.kubernetesVersionInstalled;
    	      this.provider = defaults.provider;
    	      this.versionInstalledErrorMessage = defaults.versionInstalledErrorMessage;
        }

        public Builder agonesVersionInstalled(String agonesVersionInstalled) {
            this.agonesVersionInstalled = Objects.requireNonNull(agonesVersionInstalled);
            return this;
        }
        public Builder agonesVersionTargeted(String agonesVersionTargeted) {
            this.agonesVersionTargeted = Objects.requireNonNull(agonesVersionTargeted);
            return this;
        }
        public Builder installationState(String installationState) {
            this.installationState = Objects.requireNonNull(installationState);
            return this;
        }
        public Builder kubernetesVersionInstalled(String kubernetesVersionInstalled) {
            this.kubernetesVersionInstalled = Objects.requireNonNull(kubernetesVersionInstalled);
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder versionInstalledErrorMessage(String versionInstalledErrorMessage) {
            this.versionInstalledErrorMessage = Objects.requireNonNull(versionInstalledErrorMessage);
            return this;
        }        public KubernetesClusterStateResponse build() {
            return new KubernetesClusterStateResponse(agonesVersionInstalled, agonesVersionTargeted, installationState, kubernetesVersionInstalled, provider, versionInstalledErrorMessage);
        }
    }
}
