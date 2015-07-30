/*
 * Copyright 2013-2015 RapidMiner GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.rapidminer.gradle
/**
 * The java-publishing plugin that uses the 'maven-publish' plugin to preconfigure RapidMiner publications
 * for public open-source projects.
 *
 * @author Nils Woehler
 *
 */
class RapidMinerJavaApache2PublishingPlugin extends RapidMinerJavaOpenSourcePublishingPlugin {


    @Override
    def void configurePublicationExtensionDefaults(PublishingExtension extension) {
        configureOpenSourcePublicationArtifacts(extension)
        extension.licenseType = PublishingExtension.LicenseTypes.APACHE_V2
    }
}
