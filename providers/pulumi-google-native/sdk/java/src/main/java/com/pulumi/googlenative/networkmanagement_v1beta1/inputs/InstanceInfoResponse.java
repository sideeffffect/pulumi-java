// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkmanagement_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * For display only. Metadata associated with a Compute Engine instance.
 * 
 */
public final class InstanceInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final InstanceInfoResponse Empty = new InstanceInfoResponse();

    /**
     * Name of a Compute Engine instance.
     * 
     */
    @Import(name="displayName", required=true)
      private final String displayName;

    public String displayName() {
        return this.displayName;
    }

    /**
     * External IP address of the network interface.
     * 
     */
    @Import(name="externalIp", required=true)
      private final String externalIp;

    public String externalIp() {
        return this.externalIp;
    }

    /**
     * Name of the network interface of a Compute Engine instance.
     * 
     */
    @Import(name="interface", required=true)
      private final String interface_;

    public String interface_() {
        return this.interface_;
    }

    /**
     * Internal IP address of the network interface.
     * 
     */
    @Import(name="internalIp", required=true)
      private final String internalIp;

    public String internalIp() {
        return this.internalIp;
    }

    /**
     * Network tags configured on the instance.
     * 
     */
    @Import(name="networkTags", required=true)
      private final List<String> networkTags;

    public List<String> networkTags() {
        return this.networkTags;
    }

    /**
     * URI of a Compute Engine network.
     * 
     */
    @Import(name="networkUri", required=true)
      private final String networkUri;

    public String networkUri() {
        return this.networkUri;
    }

    /**
     * Service account authorized for the instance.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * URI of a Compute Engine instance.
     * 
     */
    @Import(name="uri", required=true)
      private final String uri;

    public String uri() {
        return this.uri;
    }

    public InstanceInfoResponse(
        String displayName,
        String externalIp,
        String interface_,
        String internalIp,
        List<String> networkTags,
        String networkUri,
        String serviceAccount,
        String uri) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.externalIp = Objects.requireNonNull(externalIp, "expected parameter 'externalIp' to be non-null");
        this.interface_ = Objects.requireNonNull(interface_, "expected parameter 'interface_' to be non-null");
        this.internalIp = Objects.requireNonNull(internalIp, "expected parameter 'internalIp' to be non-null");
        this.networkTags = Objects.requireNonNull(networkTags, "expected parameter 'networkTags' to be non-null");
        this.networkUri = Objects.requireNonNull(networkUri, "expected parameter 'networkUri' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private InstanceInfoResponse() {
        this.displayName = null;
        this.externalIp = null;
        this.interface_ = null;
        this.internalIp = null;
        this.networkTags = List.of();
        this.networkUri = null;
        this.serviceAccount = null;
        this.uri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private String externalIp;
        private String interface_;
        private String internalIp;
        private List<String> networkTags;
        private String networkUri;
        private String serviceAccount;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.externalIp = defaults.externalIp;
    	      this.interface_ = defaults.interface_;
    	      this.internalIp = defaults.internalIp;
    	      this.networkTags = defaults.networkTags;
    	      this.networkUri = defaults.networkUri;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.uri = defaults.uri;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder externalIp(String externalIp) {
            this.externalIp = Objects.requireNonNull(externalIp);
            return this;
        }
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        public Builder internalIp(String internalIp) {
            this.internalIp = Objects.requireNonNull(internalIp);
            return this;
        }
        public Builder networkTags(List<String> networkTags) {
            this.networkTags = Objects.requireNonNull(networkTags);
            return this;
        }
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }
        public Builder networkUri(String networkUri) {
            this.networkUri = Objects.requireNonNull(networkUri);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public InstanceInfoResponse build() {
            return new InstanceInfoResponse(displayName, externalIp, interface_, internalIp, networkTags, networkUri, serviceAccount, uri);
        }
    }
}
