// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networkmanagement_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InstanceInfoResponse {
    /**
     * Name of a Compute Engine instance.
     * 
     */
    private final String displayName;
    /**
     * External IP address of the network interface.
     * 
     */
    private final String externalIp;
    /**
     * Name of the network interface of a Compute Engine instance.
     * 
     */
    private final String $interface;
    /**
     * Internal IP address of the network interface.
     * 
     */
    private final String internalIp;
    /**
     * Network tags configured on the instance.
     * 
     */
    private final List<String> networkTags;
    /**
     * URI of a Compute Engine network.
     * 
     */
    private final String networkUri;
    /**
     * Service account authorized for the instance.
     * 
     */
    private final String serviceAccount;
    /**
     * URI of a Compute Engine instance.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor
    private InstanceInfoResponse(
        @OutputCustomType.Parameter("displayName") String displayName,
        @OutputCustomType.Parameter("externalIp") String externalIp,
        @OutputCustomType.Parameter("interface") String $interface,
        @OutputCustomType.Parameter("internalIp") String internalIp,
        @OutputCustomType.Parameter("networkTags") List<String> networkTags,
        @OutputCustomType.Parameter("networkUri") String networkUri,
        @OutputCustomType.Parameter("serviceAccount") String serviceAccount,
        @OutputCustomType.Parameter("uri") String uri) {
        this.displayName = displayName;
        this.externalIp = externalIp;
        this.$interface = $interface;
        this.internalIp = internalIp;
        this.networkTags = networkTags;
        this.networkUri = networkUri;
        this.serviceAccount = serviceAccount;
        this.uri = uri;
    }

    /**
     * Name of a Compute Engine instance.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * External IP address of the network interface.
     * 
    */
    public String getExternalIp() {
        return this.externalIp;
    }
    /**
     * Name of the network interface of a Compute Engine instance.
     * 
    */
    public String get$interface() {
        return this.$interface;
    }
    /**
     * Internal IP address of the network interface.
     * 
    */
    public String getInternalIp() {
        return this.internalIp;
    }
    /**
     * Network tags configured on the instance.
     * 
    */
    public List<String> getNetworkTags() {
        return this.networkTags;
    }
    /**
     * URI of a Compute Engine network.
     * 
    */
    public String getNetworkUri() {
        return this.networkUri;
    }
    /**
     * Service account authorized for the instance.
     * 
    */
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * URI of a Compute Engine instance.
     * 
    */
    public String getUri() {
        return this.uri;
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
        private String $interface;
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
    	      this.$interface = defaults.$interface;
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

        public Builder $interface(String $interface) {
            this.$interface = Objects.requireNonNull($interface);
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
        }
        public InstanceInfoResponse build() {
            return new InstanceInfoResponse(displayName, externalIp, $interface, internalIp, networkTags, networkUri, serviceAccount, uri);
        }
    }
}
