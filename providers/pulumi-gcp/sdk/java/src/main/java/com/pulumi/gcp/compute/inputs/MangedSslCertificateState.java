// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.MangedSslCertificateManagedArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MangedSslCertificateState extends ResourceArgs {

    public static final MangedSslCertificateState Empty = new MangedSslCertificateState();

    /**
     * The unique identifier for the resource.
     * 
     */
    @Import(name="certificateId")
    private @Nullable Output<Integer> certificateId;

    /**
     * @return The unique identifier for the resource.
     * 
     */
    public Optional<Output<Integer>> certificateId() {
        return Optional.ofNullable(this.certificateId);
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
    private @Nullable Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Optional<Output<String>> creationTimestamp() {
        return Optional.ofNullable(this.creationTimestamp);
    }

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Expire time of the certificate.
     * 
     */
    @Import(name="expireTime")
    private @Nullable Output<String> expireTime;

    /**
     * @return Expire time of the certificate.
     * 
     */
    public Optional<Output<String>> expireTime() {
        return Optional.ofNullable(this.expireTime);
    }

    /**
     * Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
     * of &#39;MANAGED&#39; in &#39;type&#39;).
     * 
     */
    @Import(name="managed")
    private @Nullable Output<MangedSslCertificateManagedArgs> managed;

    /**
     * @return Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
     * of &#39;MANAGED&#39; in &#39;type&#39;).
     * 
     */
    public Optional<Output<MangedSslCertificateManagedArgs>> managed() {
        return Optional.ofNullable(this.managed);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
     * &#39;[a-z]([-a-z0-9]*[a-z0-9])?&#39; which means the first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
     * namespace as the managed SSL certificates.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
     * &#39;[a-z]([-a-z0-9]*[a-z0-9])?&#39; which means the first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
     * namespace as the managed SSL certificates.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    /**
     * Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    @Import(name="subjectAlternativeNames")
    private @Nullable Output<List<String>> subjectAlternativeNames;

    /**
     * @return Domains associated with the certificate via Subject Alternative Name.
     * 
     */
    public Optional<Output<List<String>>> subjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }

    /**
     * Enum field whose value is always &#39;MANAGED&#39; - used to signal to the API which type this is. Default value: &#34;MANAGED&#34;
     * Possible values: [&#34;MANAGED&#34;]
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Enum field whose value is always &#39;MANAGED&#39; - used to signal to the API which type this is. Default value: &#34;MANAGED&#34;
     * Possible values: [&#34;MANAGED&#34;]
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private MangedSslCertificateState() {}

    private MangedSslCertificateState(MangedSslCertificateState $) {
        this.certificateId = $.certificateId;
        this.creationTimestamp = $.creationTimestamp;
        this.description = $.description;
        this.expireTime = $.expireTime;
        this.managed = $.managed;
        this.name = $.name;
        this.project = $.project;
        this.selfLink = $.selfLink;
        this.subjectAlternativeNames = $.subjectAlternativeNames;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MangedSslCertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MangedSslCertificateState $;

        public Builder() {
            $ = new MangedSslCertificateState();
        }

        public Builder(MangedSslCertificateState defaults) {
            $ = new MangedSslCertificateState(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateId The unique identifier for the resource.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(@Nullable Output<Integer> certificateId) {
            $.certificateId = certificateId;
            return this;
        }

        /**
         * @param certificateId The unique identifier for the resource.
         * 
         * @return builder
         * 
         */
        public Builder certificateId(Integer certificateId) {
            return certificateId(Output.of(certificateId));
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            $.creationTimestamp = creationTimestamp;
            return this;
        }

        /**
         * @param creationTimestamp Creation timestamp in RFC3339 text format.
         * 
         * @return builder
         * 
         */
        public Builder creationTimestamp(String creationTimestamp) {
            return creationTimestamp(Output.of(creationTimestamp));
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param expireTime Expire time of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(@Nullable Output<String> expireTime) {
            $.expireTime = expireTime;
            return this;
        }

        /**
         * @param expireTime Expire time of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder expireTime(String expireTime) {
            return expireTime(Output.of(expireTime));
        }

        /**
         * @param managed Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
         * of &#39;MANAGED&#39; in &#39;type&#39;).
         * 
         * @return builder
         * 
         */
        public Builder managed(@Nullable Output<MangedSslCertificateManagedArgs> managed) {
            $.managed = managed;
            return this;
        }

        /**
         * @param managed Properties relevant to a managed certificate. These will be used if the certificate is managed (as indicated by a value
         * of &#39;MANAGED&#39; in &#39;type&#39;).
         * 
         * @return builder
         * 
         */
        public Builder managed(MangedSslCertificateManagedArgs managed) {
            return managed(Output.of(managed));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
         * &#39;[a-z]([-a-z0-9]*[a-z0-9])?&#39; which means the first character must be a lowercase letter, and all following characters
         * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
         * namespace as the managed SSL certificates.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and
         * comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression
         * &#39;[a-z]([-a-z0-9]*[a-z0-9])?&#39; which means the first character must be a lowercase letter, and all following characters
         * must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. These are in the same
         * namespace as the managed SSL certificates.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        /**
         * @param subjectAlternativeNames Domains associated with the certificate via Subject Alternative Name.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(@Nullable Output<List<String>> subjectAlternativeNames) {
            $.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        /**
         * @param subjectAlternativeNames Domains associated with the certificate via Subject Alternative Name.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(List<String> subjectAlternativeNames) {
            return subjectAlternativeNames(Output.of(subjectAlternativeNames));
        }

        /**
         * @param subjectAlternativeNames Domains associated with the certificate via Subject Alternative Name.
         * 
         * @return builder
         * 
         */
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }

        /**
         * @param type Enum field whose value is always &#39;MANAGED&#39; - used to signal to the API which type this is. Default value: &#34;MANAGED&#34;
         * Possible values: [&#34;MANAGED&#34;]
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Enum field whose value is always &#39;MANAGED&#39; - used to signal to the API which type this is. Default value: &#34;MANAGED&#34;
         * Possible values: [&#34;MANAGED&#34;]
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MangedSslCertificateState build() {
            return $;
        }
    }

}
