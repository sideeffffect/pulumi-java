// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.firebasehosting_v1beta1.inputs.DomainRedirectArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainArgs Empty = new DomainArgs();

    /**
     * The domain name of the association.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * If set, the domain should redirect with the provided parameters.
     * 
     */
    @InputImport(name="domainRedirect")
      private final @Nullable Input<DomainRedirectArgs> domainRedirect;

    public Input<DomainRedirectArgs> getDomainRedirect() {
        return this.domainRedirect == null ? Input.empty() : this.domainRedirect;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The site name of the association.
     * 
     */
    @InputImport(name="site", required=true)
      private final Input<String> site;

    public Input<String> getSite() {
        return this.site;
    }

    @InputImport(name="siteId", required=true)
      private final Input<String> siteId;

    public Input<String> getSiteId() {
        return this.siteId;
    }

    public DomainArgs(
        Input<String> domainName,
        @Nullable Input<DomainRedirectArgs> domainRedirect,
        @Nullable Input<String> project,
        Input<String> site,
        Input<String> siteId) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainRedirect = domainRedirect;
        this.project = project;
        this.site = Objects.requireNonNull(site, "expected parameter 'site' to be non-null");
        this.siteId = Objects.requireNonNull(siteId, "expected parameter 'siteId' to be non-null");
    }

    private DomainArgs() {
        this.domainName = Input.empty();
        this.domainRedirect = Input.empty();
        this.project = Input.empty();
        this.site = Input.empty();
        this.siteId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainName;
        private @Nullable Input<DomainRedirectArgs> domainRedirect;
        private @Nullable Input<String> project;
        private Input<String> site;
        private Input<String> siteId;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainRedirect = defaults.domainRedirect;
    	      this.project = defaults.project;
    	      this.site = defaults.site;
    	      this.siteId = defaults.siteId;
        }

        public Builder domainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder domainRedirect(@Nullable Input<DomainRedirectArgs> domainRedirect) {
            this.domainRedirect = domainRedirect;
            return this;
        }

        public Builder domainRedirect(@Nullable DomainRedirectArgs domainRedirect) {
            this.domainRedirect = Input.ofNullable(domainRedirect);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder site(Input<String> site) {
            this.site = Objects.requireNonNull(site);
            return this;
        }

        public Builder site(String site) {
            this.site = Input.of(Objects.requireNonNull(site));
            return this;
        }

        public Builder siteId(Input<String> siteId) {
            this.siteId = Objects.requireNonNull(siteId);
            return this;
        }

        public Builder siteId(String siteId) {
            this.siteId = Input.of(Objects.requireNonNull(siteId));
            return this;
        }
        public DomainArgs build() {
            return new DomainArgs(domainName, domainRedirect, project, site, siteId);
        }
    }
}
