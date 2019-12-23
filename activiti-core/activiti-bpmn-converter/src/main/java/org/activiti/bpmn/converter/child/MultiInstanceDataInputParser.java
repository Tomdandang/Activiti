/*
 * Copyright 2019 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.bpmn.converter.child;

import static org.activiti.bpmn.constants.BpmnXMLConstants.ELEMENT_MULTIINSTANCE_DATAINPUT;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import org.activiti.bpmn.model.MultiInstanceLoopCharacteristics;

public class MultiInstanceDataInputParser implements ElementParser<MultiInstanceLoopCharacteristics> {

    @Override
    public boolean canParseCurrentElement(XMLStreamReader reader) {
        return reader.isStartElement() && ELEMENT_MULTIINSTANCE_DATAINPUT.equalsIgnoreCase(reader.getLocalName());
    }

    @Override
    public void setInformation(XMLStreamReader reader,
        MultiInstanceLoopCharacteristics loopCharacteristics) throws XMLStreamException {
        loopCharacteristics.setInputDataItem(reader.getElementText());
    }
}