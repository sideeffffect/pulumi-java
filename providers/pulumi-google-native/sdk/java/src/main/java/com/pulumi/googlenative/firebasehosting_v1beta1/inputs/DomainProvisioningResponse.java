// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.firebasehosting_v1beta1.inputs.CertDnsChallengeResponse;
import com.pulumi.googlenative.firebasehosting_v1beta1.inputs.CertHttpChallengeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The current certificate provisioning status information for a domain.
 * 
 */
public final class DomainProvisioningResponse extends com.pulumi.resources.InvokeArgs {

    public static final DomainProvisioningResponse Empty = new DomainProvisioningResponse();

    /**
     * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
     * 
     */
    @Import(name="certChallengeDiscoveredTxt", required=true)
      private final List<String> certChallengeDiscoveredTxt;

    public List<String> certChallengeDiscoveredTxt() {
        return this.certChallengeDiscoveredTxt;
    }

    /**
     * The DNS challenge for generating a certificate.
     * 
     */
    @Import(name="certChallengeDns", required=true)
      private final CertDnsChallengeResponse certChallengeDns;

    public CertDnsChallengeResponse certChallengeDns() {
        return this.certChallengeDns;
    }

    /**
     * The HTTP challenge for generating a certificate.
     * 
     */
    @Import(name="certChallengeHttp", required=true)
      private final CertHttpChallengeResponse certChallengeHttp;

    public CertHttpChallengeResponse certChallengeHttp() {
        return this.certChallengeHttp;
    }

    /**
     * The certificate provisioning status; updated when Firebase Hosting provisions an SSL certificate for the domain.
     * 
     */
    @Import(name="certStatus", required=true)
      private final String certStatus;

    public String certStatus() {
        return this.certStatus;
    }

    /**
     * The IPs found at the last DNS fetch.
     * 
     */
    @Import(name="discoveredIps", required=true)
      private final List<String> discoveredIps;

    public List<String> discoveredIps() {
        return this.discoveredIps;
    }

    /**
     * The time at which the last DNS fetch occurred.
     * 
     */
    @Import(name="dnsFetchTime", required=true)
      private final String dnsFetchTime;

    public String dnsFetchTime() {
        return this.dnsFetchTime;
    }

    /**
     * The DNS record match status as of the last DNS fetch.
     * 
     */
    @Import(name="dnsStatus", required=true)
      private final String dnsStatus;

    public String dnsStatus() {
        return this.dnsStatus;
    }

    /**
     * The list of IPs to which the domain is expected to resolve.
     * 
     */
    @Import(name="expectedIps", required=true)
      private final List<String> expectedIps;

    public List<String> expectedIps() {
        return this.expectedIps;
    }

    public DomainProvisioningResponse(
        List<String> certChallengeDiscoveredTxt,
        CertDnsChallengeResponse certChallengeDns,
        CertHttpChallengeResponse certChallengeHttp,
        String certStatus,
        List<String> discoveredIps,
        String dnsFetchTime,
        String dnsStatus,
        List<String> expectedIps) {
        this.certChallengeDiscoveredTxt = Objects.requireNonNull(certChallengeDiscoveredTxt, "expected parameter 'certChallengeDiscoveredTxt' to be non-null");
        this.certChallengeDns = Objects.requireNonNull(certChallengeDns, "expected parameter 'certChallengeDns' to be non-null");
        this.certChallengeHttp = Objects.requireNonNull(certChallengeHttp, "expected parameter 'certChallengeHttp' to be non-null");
        this.certStatus = Objects.requireNonNull(certStatus, "expected parameter 'certStatus' to be non-null");
        this.discoveredIps = Objects.requireNonNull(discoveredIps, "expected parameter 'discoveredIps' to be non-null");
        this.dnsFetchTime = Objects.requireNonNull(dnsFetchTime, "expected parameter 'dnsFetchTime' to be non-null");
        this.dnsStatus = Objects.requireNonNull(dnsStatus, "expected parameter 'dnsStatus' to be non-null");
        this.expectedIps = Objects.requireNonNull(expectedIps, "expected parameter 'expectedIps' to be non-null");
    }

    private DomainProvisioningResponse() {
        this.certChallengeDiscoveredTxt = List.of();
        this.certChallengeDns = null;
        this.certChallengeHttp = null;
        this.certStatus = null;
        this.discoveredIps = List.of();
        this.dnsFetchTime = null;
        this.dnsStatus = null;
        this.expectedIps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainProvisioningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certChallengeDiscoveredTxt;
        private CertDnsChallengeResponse certChallengeDns;
        private CertHttpChallengeResponse certChallengeHttp;
        private String certStatus;
        private List<String> discoveredIps;
        private String dnsFetchTime;
        private String dnsStatus;
        private List<String> expectedIps;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainProvisioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certChallengeDiscoveredTxt = defaults.certChallengeDiscoveredTxt;
    	      this.certChallengeDns = defaults.certChallengeDns;
    	      this.certChallengeHttp = defaults.certChallengeHttp;
    	      this.certStatus = defaults.certStatus;
    	      this.discoveredIps = defaults.discoveredIps;
    	      this.dnsFetchTime = defaults.dnsFetchTime;
    	      this.dnsStatus = defaults.dnsStatus;
    	      this.expectedIps = defaults.expectedIps;
        }

        public Builder certChallengeDiscoveredTxt(List<String> certChallengeDiscoveredTxt) {
            this.certChallengeDiscoveredTxt = Objects.requireNonNull(certChallengeDiscoveredTxt);
            return this;
        }
        public Builder certChallengeDiscoveredTxt(String... certChallengeDiscoveredTxt) {
            return certChallengeDiscoveredTxt(List.of(certChallengeDiscoveredTxt));
        }
        public Builder certChallengeDns(CertDnsChallengeResponse certChallengeDns) {
            this.certChallengeDns = Objects.requireNonNull(certChallengeDns);
            return this;
        }
        public Builder certChallengeHttp(CertHttpChallengeResponse certChallengeHttp) {
            this.certChallengeHttp = Objects.requireNonNull(certChallengeHttp);
            return this;
        }
        public Builder certStatus(String certStatus) {
            this.certStatus = Objects.requireNonNull(certStatus);
            return this;
        }
        public Builder discoveredIps(List<String> discoveredIps) {
            this.discoveredIps = Objects.requireNonNull(discoveredIps);
            return this;
        }
        public Builder discoveredIps(String... discoveredIps) {
            return discoveredIps(List.of(discoveredIps));
        }
        public Builder dnsFetchTime(String dnsFetchTime) {
            this.dnsFetchTime = Objects.requireNonNull(dnsFetchTime);
            return this;
        }
        public Builder dnsStatus(String dnsStatus) {
            this.dnsStatus = Objects.requireNonNull(dnsStatus);
            return this;
        }
        public Builder expectedIps(List<String> expectedIps) {
            this.expectedIps = Objects.requireNonNull(expectedIps);
            return this;
        }
        public Builder expectedIps(String... expectedIps) {
            return expectedIps(List.of(expectedIps));
        }        public DomainProvisioningResponse build() {
            return new DomainProvisioningResponse(certChallengeDiscoveredTxt, certChallengeDns, certChallengeHttp, certStatus, discoveredIps, dnsFetchTime, dnsStatus, expectedIps);
        }
    }
}
