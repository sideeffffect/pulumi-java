// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emr.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterKerberosAttributesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterKerberosAttributesArgs Empty = new ClusterKerberosAttributesArgs();

    /**
     * Active Directory password for `ad_domain_join_user`. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="adDomainJoinPassword")
    private @Nullable Output<String> adDomainJoinPassword;

    public Optional<Output<String>> adDomainJoinPassword() {
        return Optional.ofNullable(this.adDomainJoinPassword);
    }

    /**
     * Required only when establishing a cross-realm trust with an Active Directory domain. A user with sufficient privileges to join resources to the domain. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="adDomainJoinUser")
    private @Nullable Output<String> adDomainJoinUser;

    public Optional<Output<String>> adDomainJoinUser() {
        return Optional.ofNullable(this.adDomainJoinUser);
    }

    /**
     * Required only when establishing a cross-realm trust with a KDC in a different realm. The cross-realm principal password, which must be identical across realms. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="crossRealmTrustPrincipalPassword")
    private @Nullable Output<String> crossRealmTrustPrincipalPassword;

    public Optional<Output<String>> crossRealmTrustPrincipalPassword() {
        return Optional.ofNullable(this.crossRealmTrustPrincipalPassword);
    }

    /**
     * Password used within the cluster for the kadmin service on the cluster-dedicated KDC, which maintains Kerberos principals, password policies, and keytabs for the cluster. This provider cannot perform drift detection of this configuration.
     * 
     */
    @Import(name="kdcAdminPassword", required=true)
    private Output<String> kdcAdminPassword;

    public Output<String> kdcAdminPassword() {
        return this.kdcAdminPassword;
    }

    /**
     * Name of the Kerberos realm to which all nodes in a cluster belong. For example, `EC2.INTERNAL`
     * 
     */
    @Import(name="realm", required=true)
    private Output<String> realm;

    public Output<String> realm() {
        return this.realm;
    }

    private ClusterKerberosAttributesArgs() {}

    private ClusterKerberosAttributesArgs(ClusterKerberosAttributesArgs $) {
        this.adDomainJoinPassword = $.adDomainJoinPassword;
        this.adDomainJoinUser = $.adDomainJoinUser;
        this.crossRealmTrustPrincipalPassword = $.crossRealmTrustPrincipalPassword;
        this.kdcAdminPassword = $.kdcAdminPassword;
        this.realm = $.realm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterKerberosAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterKerberosAttributesArgs $;

        public Builder() {
            $ = new ClusterKerberosAttributesArgs();
        }

        public Builder(ClusterKerberosAttributesArgs defaults) {
            $ = new ClusterKerberosAttributesArgs(Objects.requireNonNull(defaults));
        }

        public Builder adDomainJoinPassword(@Nullable Output<String> adDomainJoinPassword) {
            $.adDomainJoinPassword = adDomainJoinPassword;
            return this;
        }

        public Builder adDomainJoinPassword(String adDomainJoinPassword) {
            return adDomainJoinPassword(Output.of(adDomainJoinPassword));
        }

        public Builder adDomainJoinUser(@Nullable Output<String> adDomainJoinUser) {
            $.adDomainJoinUser = adDomainJoinUser;
            return this;
        }

        public Builder adDomainJoinUser(String adDomainJoinUser) {
            return adDomainJoinUser(Output.of(adDomainJoinUser));
        }

        public Builder crossRealmTrustPrincipalPassword(@Nullable Output<String> crossRealmTrustPrincipalPassword) {
            $.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
            return this;
        }

        public Builder crossRealmTrustPrincipalPassword(String crossRealmTrustPrincipalPassword) {
            return crossRealmTrustPrincipalPassword(Output.of(crossRealmTrustPrincipalPassword));
        }

        public Builder kdcAdminPassword(Output<String> kdcAdminPassword) {
            $.kdcAdminPassword = kdcAdminPassword;
            return this;
        }

        public Builder kdcAdminPassword(String kdcAdminPassword) {
            return kdcAdminPassword(Output.of(kdcAdminPassword));
        }

        public Builder realm(Output<String> realm) {
            $.realm = realm;
            return this;
        }

        public Builder realm(String realm) {
            return realm(Output.of(realm));
        }

        public ClusterKerberosAttributesArgs build() {
            $.kdcAdminPassword = Objects.requireNonNull($.kdcAdminPassword, "expected parameter 'kdcAdminPassword' to be non-null");
            $.realm = Objects.requireNonNull($.realm, "expected parameter 'realm' to be non-null");
            return $;
        }
    }

}
